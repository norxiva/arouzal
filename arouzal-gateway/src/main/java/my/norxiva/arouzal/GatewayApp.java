package my.norxiva.arouzal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class GatewayApp {
  public static void main(String[] args) {
    SpringApplication.run(GatewayApp.class, args);
  }
}
