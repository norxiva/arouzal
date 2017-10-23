package my.norxiva.arouzal.gateway.endpoint;

import my.norxiva.arouzal.gateway.payment.PaymentOrderManager;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/payment")
public class PaymentEndpoint {

    private DataBufferFactory dataBufferFactory = new DefaultDataBufferFactory();

    private PaymentOrderManager paymentOrderManager;

    public PaymentEndpoint(PaymentOrderManager paymentOrderManager) {
        this.paymentOrderManager = paymentOrderManager;
    }

    @RequestMapping("test")
    public String test(){
        return "Just for test!";
    }

    @GetMapping("hello")
    public Mono<String> hello(@RequestParam String name) {
        return Mono.just("Hello, " + name + "!");
    }

    @GetMapping("waiting")
    public Mono<String> waiting(){
        return Mono.never();
    }

    // there is a NoSuchMethodException throwing here.
    @RequestMapping("/exchange")
    public Mono<Void> exchange(ServerWebExchange exchange) {
        ServerHttpResponse response = exchange.getResponse();
        response.setStatusCode(HttpStatus.OK);
        response.getHeaders().setContentType(MediaType.TEXT_PLAIN);
        DataBuffer buf = dataBufferFactory.wrap("Hello from exchange".getBytes(StandardCharsets.UTF_8));
        return response.writeWith(Flux.just(buf));
    }

    @RequestMapping("/error")
    public Mono<String> error() {
        return Mono.error(new IllegalArgumentException("My custom error message"));
    }

}
