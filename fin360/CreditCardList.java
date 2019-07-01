package contract.cibil.fin360;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditCardList {

    @JsonProperty("highestCredit")
    public Double highestCredit;

    @JsonProperty("limitLeft")
    public Double limitLeft;

    @JsonProperty("percentage")
    public Double percentage;
}
