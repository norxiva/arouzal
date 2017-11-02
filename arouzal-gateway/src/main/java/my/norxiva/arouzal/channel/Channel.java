package my.norxiva.arouzal.channel;

import lombok.Data;
import my.norxiva.arouzal.commons.ChannelType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class Channel {

  @Id
  private String id;

  private ChannelType type;

  private String name;

  private String description;

  private LocalDateTime createdTime;

  private LocalDateTime updatedTime;

  private boolean maintained;

  private String thirdPartyMerchantNo;

  private String base64PrivateKey;

  private String privateKeyType;

  private String base64PublicKey;

  private String publicKeyType;

  private String base64SecretKey;

  private String cipherAlgorithm;

  private String signatureAlgorithm;

  private String url;

  private String callbackUrl;




}
