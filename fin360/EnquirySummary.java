package contract.cibil.fin360;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Anshu Goyal on 22/05/18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnquirySummary {

    @JsonProperty("past12Months")
    public String past12Months;
    @JsonProperty("past24Months")
    public String past24Months;
    @JsonProperty("past30Days")
    public String past30Days;
    @JsonProperty("recent")
    public String recent;
    @JsonProperty("total")
    public String total;

}

