package my.norxiva.arouzal.akka.persistence;

import java.io.Serializable;

public class Cmd implements Serializable {
  private static final long serialVersionUID = -4788496529080799454L;

  private final String data;

  public Cmd(String data) {
    this.data = data;
  }

  String getData() {
    return data;
  }
}
