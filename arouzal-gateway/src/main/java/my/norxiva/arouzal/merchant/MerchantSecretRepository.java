package my.norxiva.arouzal.merchant;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MerchantSecretRepository extends ReactiveMongoRepository<MerchantSecret, String> {
}
