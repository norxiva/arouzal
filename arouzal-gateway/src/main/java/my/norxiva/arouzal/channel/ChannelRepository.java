package my.norxiva.arouzal.channel;

import my.norxiva.arouzal.commons.ChannelType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ChannelRepository extends ReactiveMongoRepository<Channel, String> {

  Mono<Channel> findByType(ChannelType type);

}
