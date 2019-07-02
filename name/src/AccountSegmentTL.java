import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class AccountFetch{

}


public class AccountSegmentTL {
    static Map<String, String> keyValueMap = new HashMap<>();

    public static void main(String args[]) throws IOException {
        String tag, value, accountType, ownershipIndicator="",highCreditAmount,currentBalance;
        String menberShortName, accountNumber,dateOpened,dateOfLastPayment,dateReported;
        String str = "TL04T0010213NOT DISCLOSED031900043467710044932850402100501108082404200709082309201411080810201412058514913052612928540000000000000000000000000000000000000000000000000000002954000000000000000000000000000000000000000000XXXXXXXXXXXX300801102014310801112011320200";
        String word = "TL04T00";
        List<AccountFetch> al = new ArrayList<>();
        for (int i = -1; (i = str.indexOf(word, i - 1)) != -1; i++) {
            int length;

            i = i + 8;
            tag = str.substring(i, i + 2);
            if (tag.equals("02")) {
                i = i + 2;
                length = Integer.parseInt(str.substring(i, i + 2));
                i = i + 2;
                menberShortName = str.substring(i, i + length);
                //System.out.println(menberShortName);
                i = i + length;
                tag = str.substring(i, i + 2);
            }
            if (tag.equals("03")) {
                i = i + 2;
                length = Integer.parseInt(str.substring(i, i + 2));
                i = i + 2;
                accountNumber = str.substring(i, i + length);
                i = i + length;
                tag = str.substring(i, i + 2);
            }
            if (tag.equals("04")) {
                keyValueMap = EMploymentInfo.createKeyValueMap("AccountTypeTable.txt", 2);
                i = i + 4;
                value = str.substring(i, i + 2);
                accountType = keyValueMap.get(value);
                i = i + 2;
                tag = str.substring(i, i + 2);
            }
            if (tag.equals("05")) {
                i = i + 4;
                value = str.substring(i, i + 1);
                i = i + 1;
                switch (value) {
                    case "1":
                        ownershipIndicator = "Individual";
                        break;
                    case "2":
                        ownershipIndicator = "Authorised Users";
                        break;
                    case "3":
                        ownershipIndicator = "Guarantor";
                        break;
                    case "4":
                        ownershipIndicator = "Joint";
                        break;
                }
                tag=str.substring(i,i+2);

            }
          if(tag.equals("08")){
              i=i+4;
              dateOpened=str.substring(i,i+8);
              i=i+8;
              tag=str.substring(i,i+2);
              System.out.println("date opened "+dateOpened);
          }
          if(tag.equals("09"))
          {
              i=i+4;
              dateOfLastPayment=str.substring(i,i+8);
              i=i+8;
              tag=str.substring(i,i+2);
              System.out.println("Date of last payment "+dateOfLastPayment);
          }
            if(tag.equals("11"))
            {
                i=i+4;
                dateReported=str.substring(i,i+8);
                i=i+8;
                tag=str.substring(i,i+2);
                System.out.println("Date reporteg "+dateReported);
            }
            if (tag.equals("12")) {
                i = i + 2;
                length = Integer.parseInt(str.substring(i, i + 2));
                i = i + 2;
                highCreditAmount = str.substring(i, i + length);
                i = i + length;
                tag = str.substring(i, i + 2);
                System.out.println("high credit amount "+highCreditAmount);
            }
            if (tag.equals("13")) {
                i = i + 2;
                length = Integer.parseInt(str.substring(i, i + 2));
                i = i + 2;
                currentBalance = str.substring(i, i + length);
                i = i + length;
                tag = str.substring(i, i + 2);
                System.out.println("current balance "+currentBalance);
            }


        }


    }
}