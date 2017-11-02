package my.norxiva.arouzal.gateway.endpoint;

import my.norxiva.arouzal.channel.Channel;
import my.norxiva.arouzal.channel.ChannelService;
import my.norxiva.arouzal.commons.ChannelType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("channels")
public class ChannelEndpoint {

  private ChannelService channelService;

  public ChannelEndpoint(ChannelService channelService) {
    this.channelService = channelService;
  }


  @GetMapping("{type}")
  public Mono<Channel> find(@PathVariable ChannelType type){
    return channelService.rxFind(type);
  }

  @GetMapping("/id/{id}")
  public Mono<Channel> findById(@PathVariable String id){
    return channelService.rxFind(id);
  }

  @PostMapping
  public Mono<Channel> create(@RequestBody Channel channel){
    return channelService.rxSave(channel);
  }

  @DeleteMapping("{id}")
  public Mono<Void> delete(@PathVariable String id){
    return channelService.rxDelete(id);
  }


}
