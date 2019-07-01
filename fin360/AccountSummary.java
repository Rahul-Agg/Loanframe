package contract.cibil.fin360;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Anshu Goyal on 22/05/18.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountSummary {

    @JsonProperty("currentBalance")
    private Double currentBalance;
    @JsonProperty("highCredit")
    private Double highCredit;
    @JsonProperty("oldestDateOpened")
    private String oldestDateOpened;
    @JsonProperty("overdueAccount")
    private String overdueAccount;
    @JsonProperty("overdueBalance")
    private String overdueBalance;
    @JsonProperty("recentDateOpened")
    private String recentDateOpened;
    @JsonProperty("totalAccount")
    private Integer totalAccount;
    @JsonProperty("zeroBalanceAccount")
    private Integer zeroBalanceAccount;

}

