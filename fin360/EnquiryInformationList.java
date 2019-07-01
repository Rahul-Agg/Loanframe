package contract.cibil.fin360;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Anshu Goyal on 22/05/18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnquiryInformationList {

    @JsonProperty("dateOfEnquiry")
    public String dateOfEnquiry;
    @JsonProperty("enquiryAmount")
    public String enquiryAmount;
    @JsonProperty("enquiryPurpose")
    public String enquiryPurpose;
    @JsonProperty("memberName")
    public String memberName;

}

