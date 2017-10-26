package my.norxiva.arouzal.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import my.norxiva.arouzal.common.MerchantStatus;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
@Entity
@Table(name = "merchant")
public class Merchant {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Long version;

    @Column(length = 64, nullable = false)
    private String no;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(length = 32)
    private String telephone;

    @Column
    private String email;

    @Column
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(length = 32, nullable = false)
    private MerchantStatus status;
}
