package my.norxiva.arouzal.channel;

import my.norxiva.arouzal.commons.ChannelType;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ChannelService {

  private ChannelRepository channelRepository;

  public ChannelService(ChannelRepository channelRepository) {
    this.channelRepository = channelRepository;
  }

  public Mono<Channel> rxFind(ChannelType type){
    return channelRepository.findByType(type);
  }

  public Mono<Channel> rxFind(String id){
    return channelRepository.findById(id);
  }
  public Mono<Channel> rxSave(Channel entity){
    return channelRepository.save(entity);
  }

  public Mono<Void> rxDelete(String id){
    return channelRepository.deleteById(id);
  }

}
