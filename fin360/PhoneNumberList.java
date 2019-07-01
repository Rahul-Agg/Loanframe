package contract.cibil.fin360;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Anshu Goyal on 22/05/18.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhoneNumberList {

    @JsonProperty("extension")
    private String extension;
    @JsonProperty("number")
    private String number;
    @JsonProperty("type")
    private String type;

}

