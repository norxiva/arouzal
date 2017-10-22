package my.norxiva.arouzal.gateway;

//import org.glassfish.jersey.server.ResourceConfig;
//import org.glassfish.jersey.server.ServerProperties;
import org.springframework.stereotype.Component;

// can not load head of https://repo.spring.io/libs-milestone/javax/ws/rs/javax.ws.rs-api/2.1/javax.ws.rs-api-2.1.$%7Bpackaging.type%7D'

// Error:Could not HEAD 'https://repo.spring.io/libs-milestone/javax/ws/rs/javax.ws.rs-api/2.1/javax.ws.rs-api-2.1.$%7Bpackaging.type%7D'. Received status code 400 from server: Bad Request
//<a href="toggle.offline.mode">Enable Gradle 'offline mode' and sync project</a>

@Component
public class JerseyConfig
//        extends ResourceConfig
{

    public JerseyConfig() {
//        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);

    }
}
