import java.util.ArrayList;
import java.util.List;

public class ContactInformationList {
    private String address;
    private String stateCode;
    private String pin;
    private String category;
    private String residenceCode;
    private String dateReported;
    private String status;
    private String memberSName;
    private String enrichedThrEnquiry;
    /*
    CibilUploadResult cibil;
    {
        cibil = new CibilUploadResult();
    }
    */
    static List<ContactInformationList> contactInformationList;
    static {
        contactInformationList = new ArrayList<>();
    }
    public ContactInformationList()
    {}
    private ContactInformationList(
             String address,
             String stateCode,
             String pin,
             String category,
             String residenceCode,
             String dateReported,
             String status,
             String memberSName,
             String enrichedThrEnquiry)
    {
        this.address=address;
        this.stateCode=stateCode;
        this.pin=pin;
        this.category=category;
        this.residenceCode=residenceCode;
        this.dateReported=dateReported;
        this.status=status;
        this.memberSName=memberSName;
        this.enrichedThrEnquiry=enrichedThrEnquiry;
    }

    private void contactInformation(String tuefResponse)
    {
        String word="PA03A0";
        int index=0;
        for ( index = -1; (index = tuefResponse.indexOf(word, index + 1)) != -1; index+=word.length())
        {
            String tag="";
            index=index+7;
            tag =tuefResponse.substring(index,index+2);
            //System.out.println(tag);
            index=index+2;
            if(tag.equals("01"))
            {
                index=new ContactInformationList().addressDelt(tuefResponse,index);
            }
            tag = tuefResponse.substring(index,index+2);
            index=index+2;
            if(tag.equals("02"))
            {
                index=new ContactInformationList().addressDelt(tuefResponse,index);
            }
            tag = tuefResponse.substring(index,index+2);
            index=index+2;
            if(tag.equals("03"))
            {
                index=new ContactInformationList().addressDelt(tuefResponse,index);
            }
            tag = tuefResponse.substring(index,index+2);
            index=index+2;
            if(tag.equals("04")||tag.equals("06"))
            {
                index=new ContactInformationList().addressDelt(tuefResponse,index);
            }
            tag = tuefResponse.substring(index,index+2);
            index=index+2;
            System.out.println(tag);
            if(tag.equals("05")||tag.equals("07"))
            {
                index=new ContactInformationList().addressDelt(tuefResponse,index);
            }
            //System.out.println(tuefResponse.substring(index));
        }
    }
    public int addressDelt(String tuefResponse, int index)
    {
        int length=Integer.parseInt(tuefResponse.substring(index,index+2));
        index=index+2;
        address=tuefResponse.substring(index,index+length);
        System.out.println(address);
        index=index+length;
        return index;
    }
    public static void main(String [] arg)
    {
        String data ="PA03A010134NEW NO.13 OLD NO.107,UNION CARBIDE0229COLONY,5TH STREET  KODUNGAYUR0313POST,CHENNAI" +
                ",06023307066001180802021008110320159001YPA03A020134NEW NO.12 OLD NO.107,UNION CARBIDE0229COLONY,5TH " +
                "STREET  KODUNGAYUR0313POST,CHENNAI,06023307066001180802021008110320159001YPA03A030134NEW NO.11 OLD " +
                "NO.107,UNION CARBIDE0229COLONY,5TH STREET  KODUNGAYUR0312POST,CHENNAI060233070660011808020210081103201" +
                "59001YPA03A040135NO 179/1, BUILDING 2, UNION CARBIDE0230COLONY,7TH STREET , KODUNGAYUR0312POST," +
                "CHENNAI06023307066001190802021008110320159001Y";

        new ContactInformationList().contactInformation(data);
    }
}
