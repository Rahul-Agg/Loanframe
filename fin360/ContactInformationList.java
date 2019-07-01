package contract.cibil.fin360;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Anshu Goyal on 22/05/18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactInformationList {

    @JsonProperty("address")
    private String address;
    @JsonProperty("category")
    private String category;
    @JsonProperty("dateReported")
    private String dateReported;
    @JsonProperty("status")
    private String status;

}

