package contract.cibil.fin360;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Anshu Goyal on 22/05/18.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class SanctionedBalance {

    @JsonProperty("creditBalanceLeft")
    private Double creditBalanceLeft;
    @JsonProperty("highestSanctionedAmount")
    private Double highestSanctionedAmount;
    @JsonProperty("percentage")
    private Double percentage;
    @JsonProperty("totalSanctionedAmount")
    private Double totalSanctionedAmount;

}

