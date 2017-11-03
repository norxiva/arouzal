package my.norxiva.arouzal.channel;

import my.norxiva.arouzal.commons.ChannelType;
import org.springframework.stereotype.Component;

@Component
public class ChannelService {

  private ChannelRepository channelRepository;

  public ChannelService(ChannelRepository channelRepository) {
    this.channelRepository = channelRepository;
  }

  public Channel find(ChannelType type){
    return channelRepository.findByType(type);
  }

  public Channel find(String id){
    return channelRepository.findOne(id);
  }
  public Channel save(Channel entity){
    return channelRepository.save(entity);
  }

  public void delete(String id){
    channelRepository.delete(id);
  }

}
