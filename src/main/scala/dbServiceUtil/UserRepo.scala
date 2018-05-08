package dbServiceUtil

import connection.{DbComponent, MySqlDbComponent}
import slick.jdbc.MySQLProfile.api._
import slick.lifted.ProvenShape

import scala.concurrent.Future

case class User(id: Int, firstName: String, lastName: String, age: Int)

trait UserTable {

  val userQuery = TableQuery[UserTableMapping]

  class UserTableMapping(tag: Tag) extends Table[User](tag, "user_details") {

    def * : ProvenShape[User] = (id, firstName, lastName, age) <> (User.tupled, User.unapply)

    def id: Rep[Int] = column[Int]("id", O.PrimaryKey, O.AutoInc)

    def firstName: Rep[String] = column[String]("firstname")

    def lastName: Rep[String] = column[String]("lastname")

    def age: Rep[Int] = column[Int]("age")

  }

}

trait UserApi extends UserTable {

  def getAllUsers: Future[List[User]]

  def deleteUser(id: Int): Future[Int]

  def addUser(user: User): Future[Int]

  def updateUser(id: Int, user: User): Future[Int]

}

class UserImpl extends UserApi {
  this: DbComponent =>

  /**
    * @param user - user record to be added
    * @return - 1 if added successfully else 0
    */
  override def addUser(user: User): Future[Int] = {
    db.run(userQuery += user)
  }

  /**
    * @param id - id of user
    * @return - 1 if deleted successfully else 0
    */
  override def deleteUser(id: Int): Future[Int] = {
    db.run(userQuery.filter(_.id === id).delete)
  }

  /**
    * @param id - id of user
    * @param user - updated user record
    * @return - 1 if updated successfully else 0
    */
  override def updateUser(id: Int, user: User): Future[Int] = {
    db.run(userQuery.filter(_.id === id).update(user))
  }

  /**
    * @return - list of all users
    */
  override def getAllUsers: Future[List[User]] = {
    db.run(userQuery.to[List].result)
  }

}

class UserRepo extends UserImpl with MySqlDbComponent
