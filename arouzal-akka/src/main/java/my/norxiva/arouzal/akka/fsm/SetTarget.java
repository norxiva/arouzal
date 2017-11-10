package my.norxiva.arouzal.akka.fsm;

import akka.actor.ActorRef;

public final class SetTarget {
  private final ActorRef ref;

  SetTarget(ActorRef ref) {
    this.ref = ref;
  }

  ActorRef getRef() {
    return ref;
  }

  @Override
  public String toString() {
    return "SetTarget{" +
        "ref=" + ref +
        '}';
  }
}
