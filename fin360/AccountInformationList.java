package contract.cibil.fin360;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import contract.cibil.CodeMap;
import util.Util;

import java.util.List;
/**
 * Created by Anshu Goyal on 22/05/18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountInformationList {

    private String id = Util.newUUID();
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("actualPaymentAmount")
    private Double actualPaymentAmount;
    @JsonProperty("amountOverdue")
    public Double amountOverdue;
    @JsonProperty("assetClassificationList")
    private List<AssetClassificationList> assetClassificationList;
    @JsonProperty("bank")
    private String bank;
    @JsonProperty("cashLimit")
    private Double cashLimit;
    @JsonProperty("creditLimit")
    private Double creditLimit;
    @JsonProperty("currentBalance")
    private Double currentBalance;
    @JsonProperty("dateClosed")
    private String dateClosed;
    @JsonProperty("dateOfLastPayment")
    public String dateOfLastPayment;
    @JsonProperty("dateOpened")
    public String dateOpened;
    @JsonProperty("dateReported")
    private String dateReported;
    @JsonProperty("emiAmount")
    public Double emiAmount;
    @JsonProperty("highCredit")
    private Double highCredit;
    @JsonProperty("memberName")
    public String memberName;
    @JsonProperty("ownership")
    public String ownership;
    @JsonProperty("paymentEndDate")
    private String paymentEndDate;
    @JsonProperty("paymentFrequency")
    private String paymentFrequency;
    @JsonProperty("paymentStartDate")
    private String paymentStartDate;
    @JsonProperty("rateOfInterest")
    private Double rateOfInterest;
    @JsonProperty("repaymentTenure")
    private Double repaymentTenure;
    @JsonProperty("sanctionedAmount")
    private Double sanctionedAmount;
    @JsonProperty("settledStatus")
    private String settledStatus;
    @JsonProperty("status")
    private String status;
    @JsonProperty("settlement")
    private Double settlement;
    @JsonProperty("writtenOffPrincipal")
    private Double writtenOffPrincipal;
    @JsonProperty("writtenOffTotal")
    private Double writtenOffTotal;
    public String lfStatus = "";
    private String typeCode = "OTH";
    private String remarks = "";

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(String dateClosed) {
        this.dateClosed = dateClosed;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getRemarks() { return remarks; }

    public void setRemarks(String remarks) { this.remarks = remarks; }

    public Double getCurrentBalance() { return currentBalance; }

    public Double getSanctionedAmount() { return sanctionedAmount; }

    public void setSanctionedAmount(Double sanctionedAmount) { this.sanctionedAmount = sanctionedAmount; }
}

