import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class AddressSegment {
    static Map<String,String> keyValueMap1 = new HashMap<>();
    static Map<String,String> keyValueMap2 = new HashMap<>();

       private String  address;
       private String  stateCode;
       private String  pin;
       private String  category;
       private String  residenceCode;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getResidenceCode() {
        return residenceCode;
    }

    public void setResidenceCode(String residenceCode) {
        this.residenceCode = residenceCode;
    }



static int init(int k,String arr[],String data[],int index,StringBuffer sb)
{

    for (k = k; k < arr.length; k++) {
        String word = arr[k];
       int i = data[index].length() + word.length();
        if (i <= 40) {
            if (i == 40)
                data[index] = data[index] + word;
            if (i != 40)
                data[index] = data[index] + word + " ";
        } else{
            break;}
    }
   data[index] = data[index].trim();
    return k;
}

    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        AddressSegment obj = new AddressSegment();
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= 1; i++) {
            int n = 0;int k = 0,count=1;
            sb.append("PA03A0" + i);
            System.out.print("enter Address: ");
            String address = sc.nextLine();
            if (address.length() % 40 != 0)
                n = address.length() / 40 + 1;
            else if (address.length() % 40 == 0)
                n = address.length() / 40;
            String data[] = new String[n];
            for (int s = 0; s < n; s++)
                data[s] = "";
            String arr[] = address.split(" ");

            //Address Line 1
            int index = 0;
            while (k < arr.length) {
                k = init(k, arr, data, index, sb);
                index++;
            }
            for ( index = 0; index < n; index++) {
                int len = data[index].length();
                    if(len>=10)
                sb.append("0" + count + len + data[index]);
                    else
                        sb.append("0" + count + "0"+len + data[index]);
                count++;
            }
            System.out.print("enter your State:");
            String state = sc.nextLine();
            try {
                keyValueMap1 = createKeyValueMap1();
                keyValueMap2=createKeyValueMap2();
            }
            catch (IOException e){
                e.printStackTrace();
            }
         obj.setStateCode(keyValueMap1.get(state));
            sb.append("0602"+obj.getStateCode());
            //pincode
            System.out.print("Enter PIN Code:");
            obj.setPin(sc.nextLine());
            if(obj.getPin().length()<=10) {
                String minmaxPin = keyValueMap2.get(obj.getStateCode());
                int min = Integer.parseInt(minmaxPin.substring(0, 2));
                int max = Integer.parseInt(minmaxPin.substring(2));
                int pin = Integer.parseInt(obj.getPin().substring(0,2));
                if(pin>=min && pin<=max){
                    sb.append("070"+obj.getPin().length()+obj.getPin());
                }
                else
                    System.out.println("invalid pin");
            }
            else
                System.out.println("Invalid pin.");

            System.out.print("Address Category: ");
            obj.setCategory(sc.nextLine());
            if(obj.getCategory().equals("Permanent Address"))
                sb.append("080201");
            else if(obj.getCategory().equals("Residence Address"))
                sb.append("080202");
            else if(obj.getCategory().equals("Office Address"))
                sb.append("080203");
            else
                sb.append("080204");

        }
        System.out.println(sb);
        }

    static Map<String,String> createKeyValueMap1() throws IOException {
        FileReader file = new FileReader("C:\\Users\\LoanFrame User\\Desktop\\StareCodes.txt");
        BufferedReader bf = new BufferedReader(file);
        String st;

        while((st=bf.readLine())!=null)
        {
            //String[] parts = st.split(" ", 2);
              // String key = parts[0];
               // String value = parts[1];
            //    keyValueMap.put( value,key);

                //System.out.println(st.substring(0,2));

            if(null != st && st.length() > 0){
                String key = st.substring(0,2);
                String value=(st.substring(2)).trim();
                keyValueMap1.put(value,key);
            }

        }

        return keyValueMap1;
    }
    static Map<String,String> createKeyValueMap2() throws IOException{
        BufferedReader br = new BufferedReader((new FileReader("C:\\Users\\LoanFrame User\\Desktop\\StateCodes1.txt")));
        String line ;
        while((line = br.readLine())!=null)
        {
            String temp[] = line.split(" ");
            String sumPin = temp[2]+temp[3];
            keyValueMap2.put(temp[0],sumPin);
        }
        return  keyValueMap2;
    }
}
