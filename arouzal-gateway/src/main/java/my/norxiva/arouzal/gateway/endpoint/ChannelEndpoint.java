package my.norxiva.arouzal.gateway.endpoint;

import my.norxiva.arouzal.channel.Channel;
import my.norxiva.arouzal.channel.ChannelService;
import my.norxiva.arouzal.commons.ChannelType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("channels")
public class ChannelEndpoint {

  private ChannelService channelService;

  public ChannelEndpoint(ChannelService channelService) {
    this.channelService = channelService;
  }


  @GetMapping("{type}")
  public Channel find(@PathVariable ChannelType type){
    return channelService.find(type);
  }

  @GetMapping("/id/{id}")
  public Channel findById(@PathVariable String id){
    return channelService.find(id);
  }

  @PostMapping
  public Channel create(@RequestBody Channel channel){
    return channelService.save(channel);
  }

  @DeleteMapping("{id}")
  public void delete(@PathVariable String id){
    channelService.delete(id);
  }


}
