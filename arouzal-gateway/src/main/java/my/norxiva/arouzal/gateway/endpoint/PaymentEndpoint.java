package my.norxiva.arouzal.gateway.endpoint;

import my.norxiva.arouzal.payment.PaymentOrderManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentEndpoint {


  private PaymentOrderManager paymentOrderManager;

  public PaymentEndpoint(PaymentOrderManager paymentOrderManager) {
    this.paymentOrderManager = paymentOrderManager;
  }

  @RequestMapping("test")
  public String test() {
    return "Just for test!";
  }


}
