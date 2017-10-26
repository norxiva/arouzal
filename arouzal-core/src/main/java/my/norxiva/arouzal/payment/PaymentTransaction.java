package my.norxiva.arouzal.payment;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import my.norxiva.arouzal.common.*;
import my.norxiva.arouzal.util.JacksonUtils;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
@Entity
@Table(name = "payment_transaction", uniqueConstraints = @UniqueConstraint(columnNames = {"serial", "channel_type"}))
public class PaymentTransaction {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Long version;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private PaymentOrder paymentOrder;

    @Column(length = 64, nullable = false)
    private String serial;

    @Enumerated(EnumType.STRING)
    @Column(name = "channel_type", length = 32, nullable = false)
    private ChannelType channelType;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_type", length = 32, nullable = false)
    private PaymentType paymentType;

    @Enumerated(EnumType.STRING)
    @Column(name = "transaction_type", length = 32, nullable = false)
    private TransactionType transactionType;

    @Enumerated(EnumType.STRING)
    @Column(name = "currency_type", length = 32, nullable = false)
    private CurrencyType currencyType;

    @Column(nullable = false)
    private BigDecimal amount;

    @JsonFormat(pattern = JacksonUtils.ISO_DATE_TIME_PATTERN)
    @Column(name = "transaction_time", nullable = false)
    private LocalDateTime transactionTime;

    @JsonFormat(pattern = JacksonUtils.ISO_DATE_TIME_PATTERN)
    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @JsonFormat(pattern = JacksonUtils.ISO_DATE_TIME_PATTERN)
    @Column(name = "update_time", nullable = false)
    private LocalDateTime updateTime;

    @Enumerated(EnumType.STRING)
    @Column(length = 32, nullable = false)
    private TransactionStatus status;

    @Column
    private String code;

    @Column
    private String message;

    @Column(name = "bank_acronym", length = 32)
    private String bankAcronym;

    @Column(name = "bank_card_type", length = 32)
    private String bankCardType;

    @Column(name = "id_type", length = 32)
    private String idType;

    @Column(name = "bank_account_no", length = 64)
    private String bankAccountNo;

    @Column(name = "bank_account_name")
    private String bankAccountName;

    @Column(name = "bank_reserved_phone", length = 32)
    private String bankReservedPhone;

    @Column(name = "id_no", length = 64)
    private String idNo;
}
