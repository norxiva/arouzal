package my.norxiva.arouzal.merchant;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class MerchantSecret {

    @Id
    private String merchantNo;

    private String base64PrivateKey;

    private String base64PublicKey;

    private String base64SecretKey;

    private String cipherAlgorithm;

    private String signatureAlgorithm;
}
