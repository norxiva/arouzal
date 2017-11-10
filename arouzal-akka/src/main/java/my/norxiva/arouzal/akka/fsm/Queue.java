package my.norxiva.arouzal.akka.fsm;

public final class Queue {
  private final Object obj;

  Queue(Object obj) {
    this.obj = obj;
  }

  Object getObj() {
    return obj;
  }

  @Override
  public String toString() {
    return "Queue{" +
        "obj=" + obj +
        '}';
  }
}
