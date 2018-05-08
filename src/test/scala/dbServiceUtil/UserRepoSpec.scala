package dbServiceUtil

import connection.H2DbComponent
import org.scalatest.FunSuiteLike

import scala.concurrent.Await
import scala.concurrent.duration.Duration

class UserRepoSpec extends UserImpl with H2DbComponent with FunSuiteLike {

  test("get all users records list") {
    assert(Await.result(getAllUsers, Duration.Inf) === List(User(1, "Ayush", "Hooda", 23)))
  }

  test("add user record") {
    assert(Await.result(addUser(User(2, "Ayush", "Hooda", 23)), Duration.Inf) === 1)
  }

  test("update user record") {
    assert(Await.result(updateUser(1, User(1, "Ayu", "Hooda", 24)), Duration.Inf) === 1)
  }

  test("delete user record") {
    assert(Await.result(deleteUser(1), Duration.Inf) === 1)
  }

}
