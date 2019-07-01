package contract.cibil.fin360;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Anshu Goyal on 22/05/18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmploymentInformationList {

    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("dateReported")
    private String dateReported;
    @JsonProperty("frequency")
    private String frequency;
    @JsonProperty("income")
    private String income;
    @JsonProperty("incomeIndicator")
    private String incomeIndicator;
    @JsonProperty("occupation")
    private String occupation;

}

