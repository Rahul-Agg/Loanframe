package contract.cibil.fin360;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Objects;

/**
 * Created by Anshu Goyal on 22/05/18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountAnalysisList {

    @JsonProperty("loan")
    private String loan;
    @JsonProperty("numberOfLatePayment")
    private Integer numberOfLatePayment;

}

