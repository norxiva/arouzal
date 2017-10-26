package my.norxiva.arouzal.merchant;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MerchantSecretRepository extends MongoRepository<MerchantSecret, String>{
}
