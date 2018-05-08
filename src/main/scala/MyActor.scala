import akka.actor.{Actor, Props}
import dbServiceUtil.User
//import akka.actor.Actor.Receive

//class MyActor extends Actor {
//
//  import MyActor._
//
////  def receive: Receive = {
//////    case AddUser(user) => sender() ! addUser(user)
//////    case DeleteUser(id) => sender() ! deleteUser(id)
//////    case GetUser(id) => sender() ! getUser(id)
//////    case UpdateUser(id, user) => sender() ! updateUser(id, user)
////  }
//}

object MyActor {

//  def props: Props = Props[MyActor]

  final case class AddUser(user: User)

  final case class DeleteUser(id: Int)

  final case class GetUser(id: Int)

  final case class UpdateUser(id: Int, user: User)
}