package my.norxiva.arouzal.akka.persistence;

import java.io.Serializable;

class Evt implements Serializable{
  private static final long serialVersionUID = -6482975981367506257L;

  private final String data;

  Evt(String data) {
    this.data = data;
  }

  String getData() {
    return data;
  }
}
