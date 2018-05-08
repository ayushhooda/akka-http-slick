package routes

import akka.http.scaladsl.model.{HttpEntity, HttpResponse}
import akka.http.scaladsl.server.Route
import dbServiceUtil.UserRepo
import ch.megard.akka.http.cors.scaladsl.CorsDirectives._
import com.google.inject.Inject
import akka.http.scaladsl.server.directives.PathDirectives.path
import akka.http.scaladsl.server.Directives._

class UserRestService @Inject() (userRepo: UserRepo){

//  lazy val routes: Route = cors() {
//    pathPrefix("user") {
//      getAllUsers ~ addUser() ~ deleteUser() ~ updateUser()
//    }
//  }
//
//  def getAllUsers: Route = {
//    get {
//      path("getUsers") {
//        complete {
//          userRepo.getAllUsers.map { userList =>
//            "received"
//          }.recover {
//            "failed"
//          }
//        }
//      }
//    }
//  }
//
//  def addUser(): Route = {
//    post {
//      path("addUser") {
//        complete {
//
//        }.recover {
//
//        }
//      }
//    }
//  }
//
//  def deleteUser(): Route = {
//
//  }
//
//  def updateUser(): Route = {
//
//  }

}