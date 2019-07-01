package contract.cibil.fin360;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anshu Goyal on 22/05/18.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class LatePayment {

    @JsonProperty("accountTypeList")
    private List<String> accountTypeList = new ArrayList<>();
    @JsonProperty("totalNumberOfLatePaymentLastSixMonth")
    private String totalNumberOfLatePaymentLastSixMonth;

}

