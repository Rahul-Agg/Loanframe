package contract.cibil.fin360;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jongo.marshall.jackson.oid.MongoObjectId;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Anshu Goyal on 22/05/2018.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CibilUploadResult {

    @MongoObjectId
    public String _id;

    public String loanId;
    public String pan;

    @JsonProperty("accountAnalysisList")
    private List<AccountAnalysisList> accountAnalysisList;

    @JsonProperty("accountInformationList")
    public List<AccountInformationList> accountInformationList;

    @JsonProperty("accountSummary")
    private AccountSummary accountSummary;

    @JsonProperty("cibilIdentifier")
    public String cibilIdentifier;

    @JsonProperty("controlNumber")
    private String controlNumber;

    @JsonProperty("memberId")
    private String memberId;

    @JsonProperty("memberRefNumber")
    private String memberRefNumber;

    @JsonProperty("enquiryTime")
    private String enquiryTime;

    @JsonProperty("contactInformationList")
    private List<ContactInformationList> contactInformationList;

    @JsonProperty("creditCardList")
    private List<CreditCardList> creditCardList;

    @JsonProperty("employmentInformationList")
    private List<EmploymentInformationList> employmentInformationList;

    @JsonProperty("enquiryInformationList")
    public List<EnquiryInformationList> enquiryInformationList;

    @JsonProperty("enquirySummary")
    public EnquirySummary enquirySummary;

    @JsonProperty("identificationList")
    private List<IdentificationList> identificationList;

    @JsonProperty("latePayment")
    private LatePayment latePayment;


    @JsonProperty("loanEMIList")
    private List<LoanEMIList> loanEMIList;

    @JsonProperty("overdueLoans")
    private List<String> overdueLoans = new ArrayList<>();

    @JsonProperty("phoneNumberList")
    private List<PhoneNumberList> phoneNumberList;

    @JsonProperty("sanctionedBalance")
    private SanctionedBalance sanctionedBalance;

    @JsonProperty("types")
    private Map<String, Integer> types;

    @JsonProperty("dateOfBirth")
    private String dateOfBirth;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("message")
    private String message;

    @JsonProperty("enquiryDate")
    public String enquiryDate;

    @JsonProperty("name")
    public String name;

    @JsonProperty("numberOfCreditCardApplied")
    private Integer numberOfCreditCardApplied;

    @JsonProperty("numberOfCreditCardApproved")
    private Integer numberOfCreditCardApproved;

    @JsonProperty("numberOfLatePaymentOfCreditCard")
    private Integer numberOfLatePaymentOfCreditCard;

    @JsonProperty("numberOfLatePaymentOfCreditCardLastSixMonth")
    private Integer numberOfLatePaymentOfCreditCardLastSixMonth;

    @JsonProperty("numberOfLoansActive")
    private Integer numberOfLoansActive;

    @JsonProperty("numberOfLoansApplied")
    private Integer numberOfLoansApplied;

    @JsonProperty("numberOfLoansApproved")
    private Integer numberOfLoansApproved;

    @JsonProperty("numberOfLoansClosed")
    private Integer numberOfLoansClosed;

    @JsonProperty("numberOfOverdueAccount")
    private Integer numberOfOverdueAccount;

    @JsonProperty("score")
    public Integer score;

    @JsonProperty("scoreName")
    public String scoreName;

    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("totalNumberOfCreditCardActive")
    private Integer totalNumberOfCreditCardActive;

    @JsonProperty("totalNumberOfCreditCardClosed")
    private Integer totalNumberOfCreditCardClosed;

    @JsonProperty("totalNumberOfLatePayment")
    private Integer totalNumberOfLatePayment;

    @JsonProperty("personalLoanScore")
    private Integer personalLoanScore;


}