package my.norxiva.arouzal.akka.quickstart;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class Printer extends AbstractActor{

  static Props props(){
    return Props.create(Printer.class, Printer::new);
  }

  private LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  private Printer() {
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(Greeting.class, greeting -> log.info(greeting.message))
        .build();
  }

  static class Greeting {
    final String message;

    Greeting(String message) {
      this.message = message;
    }
  }
}
