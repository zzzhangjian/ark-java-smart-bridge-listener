package example.ark_smartbridge_listener.eth_bridge;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
@Entity
public class ContractMessage {

    /**
     * Contract is waiting for Ark Transaction to be found
     */
    public static final String STATUS_PENDING = "pending";

    /**
     * Contract was rejected because of insufficient ark
     */
    public static final String STATUS_REJECTED = "rejected";

    /**
     * Failure occurred trying to create Ethereum contract
     */
    public static final String STATUS_FAILED = "failed";

    /**
     * Contract successfully created on Ethereum
     */
    public static final String STATUS_COMPLETED = "completed";

    @Id
    @GeneratedValue
    private Long id;

    private String token;

    @Column(columnDefinition="TEXT")
    private String contractAbiJson;

    @Column(columnDefinition="TEXT")
    private String contractCode;

    @Column(columnDefinition = "TEXT")
    private String contractParamsJson;

    private String status;

    private BigDecimal ethPerArkExchangeRate;

    private BigDecimal estimatedGasCost;

    private BigDecimal estimatedEthCost;

    private BigDecimal estimatedArkCost;

    private String serviceArkAddress;

    private String returnArkAddress;

    private BigDecimal actualArkCost;

    private BigDecimal returnArkAmount;

    private String returnArkTransactionId;

    private String contractTransactionHash;

    private String contractAddress;

    private ZonedDateTime createdAt;
}
