package my.norxiva.arouzal.akka.fsm;

import akka.actor.ActorRef;

import java.util.LinkedList;
import java.util.List;

public final class Todo implements Data {
  private final ActorRef target;
  private final List<Object> queue;

  Todo(ActorRef target, List<Object> queue) {
    this.target = target;
    this.queue = queue;
  }

  ActorRef getTarget() {
    return target;
  }

  List<Object> getQueue() {
    return queue;
  }

  @Override
  public String toString() {
    return "Todo{" +
        "target=" + target +
        ", queue=" + queue +
        '}';
  }

  Todo addElement(Object element) {
    List<Object> nQueue = new LinkedList<>(queue);
    nQueue.add(element);
    return new Todo(this.target, nQueue);
  }

  Todo copy(List<Object> queue) {
    return new Todo(this.target, queue);
  }

  public Todo copy(ActorRef target) {
    return new Todo(target, this.queue);
  }
}
