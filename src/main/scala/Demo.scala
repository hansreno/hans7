import akka.actor._

object Demo {

  class hello extends Actor {
    var messages:Int = 0
    def receive = {
      case "hi" =>
        messages += 1
        println(s"hello $messages")
    }
  }

val sys = ActorSystem("TestSystem")
  val actor = sys.actorOf(Props[hello], name = "helloactor")
  val actor2 = sys.actorOf((Props[hello]), name = "hello2")

  actor ! "hi"
  actor ! "hi"
  actor ! "hi"
  actor ! "hi"
  actor ! "hi"
  actor ! "hi"
  actor ! "hi"
  actor ! "Bad Actor"
}
