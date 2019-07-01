package contract.cibil.fin360;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoanEMIList {

    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("emiAmount")
    private Integer emiAmount;
    @JsonProperty("emiLeft")
    private Integer emiLeft;
    @JsonProperty("emiPaid")
    private Integer emiPaid;
    @JsonProperty("totalEmi")
    private Integer totalEmi;
}
