package my.norxiva.arouzal.akka.persistence;

import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;
import java.util.ArrayList;

public class ExampleState implements Serializable{

  private static final long serialVersionUID = 7328340943194435230L;

  private final ArrayList<String> events;

  ExampleState() {
    this(new ArrayList<>());
  }

  private ExampleState(ArrayList<String> events) {
    this.events = events;
  }

  ExampleState copy(){
    return new ExampleState(new ArrayList<>(events));
  }

  void update(Evt evt){
    events.add(evt.getData());
  }

  int size(){
    return events.size();
  }

  @Override
  public String toString() {
    return events.toString();
  }
}
