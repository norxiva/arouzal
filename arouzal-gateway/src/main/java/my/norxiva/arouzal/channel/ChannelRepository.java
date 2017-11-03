package my.norxiva.arouzal.channel;

import my.norxiva.arouzal.commons.ChannelType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChannelRepository extends MongoRepository<Channel, String> {

  Channel findByType(ChannelType type);

}
