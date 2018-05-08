package connection

trait H2DbComponent extends DbComponent {

  override val driver = slick.jdbc.H2Profile

  import driver.api._

  val h2Url = "jdbc:h2:mem:test;MODE=MySql;DATABASE_TO_UPPER=false;INIT=runscript from '/home/knoldus/Desktop/akka-http-slick/src/test/resources/schema.sql';"

  override val db: Database = Database.forURL(url = h2Url, driver = "org.h2.Driver")

}
