import java.util.*;


public class Main {
   private String IDnumber ;
    private String IDtype ;
    private String issueDate;
    private String expiryDate;

    Main(String IDnumber,String IDtype,String issueDate,String expiryDate)
    {
        this.IDnumber=IDnumber;
        this.IDtype=IDtype;
        this.issueDate=issueDate;
        this.expiryDate=expiryDate;
    }
    public static void main(String args[]) {


        String str = "TUEF1220150101_080008_BKLO       0000XX00001111                    100076615403424032015164450PN03N010110CIBIL EDGE0206SAMPLE0312TEST SUBJECT070830121978080128102ZZ82039998308031120158406PN0001ID03I010102010210AJAPB1602NID03I020102020208B32992109001YID03I030102040216FTN0050012341997PT03T0101096638469890302009001YPT03T02011098507876540302019001YPT03T03010841014105030200PT03T0401072361313030202EC03C010133KRISHNAMURTHI.BALAJI@FISERV.CO.INEC03C020119TSKBALAJI@GMAIL.COMEM03E0101021002081103201503020180081103201582039998308110320158406EM0001SC10CIBILTUSC2010204020210030824032015040500629080201250202260215270207280218290210PA03A010134NEW NO.13 OLD NO.107,UNION CARBIDE0229COLONY,5TH STREET  KODUNGAYUR0313POST,CHENNAI,06023307066001180802021008110320159001YPA03A020134NEW NO.12 OLD NO.107,UNION CARBIDE0229COLONY,5TH STREET  KODUNGAYUR0313POST,CHENNAI,06023307066001180802021008110320159001YPA03A030134NEW NO.11 OLD NO.107,UNION CARBIDE0229COLONY,5TH STREET  KODUNGAYUR0312POST,CHENNAI06023307066001180802021008110320159001YPA03A040135NO 179/1, BUILDING 2, UNION CARBIDE0230COLONY,7TH STREET , KODUNGAYUR0312POST,CHENNAI06023307066001190802021008110320159001YTL04T0010213NOT DISCLOSED0402100501108082404200709082309201411080810201412058514913052612928540000000000000000000000000000000000000000000000000000002954000000000000000000000000000000000000000000XXXXXXXXXXXX300801102014310801112011320200TL04T0020209HDFC BANK03190004346771004493285040210050110808180520040908130720041108311020141205127991303113140310828542122122122122122122122122122122122122122122122122122122954212212212212212212212212212212212212212212212212212212300801102014310801112011330202TL04T0030209HDFC BANK03190005176350000133799040210050110808200520080908150520101108311020141205261451301028540000000000000000000000000000000000000000000000000000002954000000000000000000000000000000000000000000000000000000300801102014310801112011TL04T0040213NOT DISCLOSED040210050110808210420080908240520111108080620111205282271301028540000000000000000000000000000000000000000000000000000002954000000000000000000000000000000000000000000000000000000300801062011310801072008TL04T0050213NOT DISCLOSED0402020501408082801200809081810201110081810201111083107201312071000000130102854STDXXXXXXXXX000020000000000000000000000000XXXXXXXXX0002954XXXXXXXXX000XXXXXXXXXXXXXXX018022020XXX019XXX025000000300801102011310801112008TL04T0060213NOT DISCLOSED0402020501408082812200709080609201210081009201211083107201312071102065130102854STDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX0000000002954000000000000000000000XXXXXXXXX000XXXXXX000000000000XXX300801092012310801102009TL04T0070209HDFC BANK0319000517652100435235904021005011080817052007100814052009110831102014120585762130102854000XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX2921XXXXXXXXXXXXXXXXXXXXX300801052009310801052007TL04T0080213NOT DISCLOSED04021005011080821022006100809062006110831102014130102815000XXX000000000300801062006310801022006440203TL04T0090213NOT DISCLOSED0402020501108081411200509081101200810081501200811083110201412071075000130102854000000000000XXX000XXXXXX001001002XXXXXX0000000010010012912000002XXX0003008010120083108010420068308110320158406TL0001TL04T0100213NOT DISCLOSED04021005011080818102005090829122006100811012008110831122013120541749130102803000300801012008310801012008360553000370521200440203TL04T0110213NOT DISCLOSED04021005011080807102005100813042006110831012010130102821000000000XXX000000000300801042006310801102005TL04T0120213NOT DISCLOSED04021005011080822052004100820102005110830092008120255130102854000060030XXX0000000000000000000000000000000000000000003008090120083108040120078203003840600000186060000018706000001TL04T0130213NOT DISCLOSED0402100501108081805200409081004200610081004200611083108200812047419130102836000000000000000000000000000000000000300801042006310801052005TL04T0140213NOT DISCLOSED04021005011080817052004090806102008100804042010110831012011120532097130102854000XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX2954000000000000XXX000000000000000000XXX000000000000000000300801042010310801052007TL04T0150213NOT DISCLOSED04020505014080830012004090824082005100823012006110831102014120530000130102830STDXXXXXXXXXXXX000000000XXX000300801012006310801042005TL04T0160213NOT DISCLOSED04021005011080822052004100820102005110831052011120255130102803XXX300801102005310801102005TL04T0170213NOT DISCLOSED04021005011080822052004100804062004110831012011120529735130102803XXX300801062004310801062004TL04T0180213NOT DISCLOSED04020505011080830012004090823012006100823012006110831102014120530000130102803XXX300801012006310801012006IQ04I0010108190320150409HDFC BANK05020106041000IQ04I0020108171020140413NOT DISCLOSED05020206075000000IQ04I0030108180320140413NOT DISCLOSED05021006041000IQ04I0040108080220140409HDFC BANK05021006041000IQ04I0050108141020130413NOT DISCLOSED050210060550000IQ04I0060108170720130413NOT DISCLOSED050210060510000IQ04I0070108210220130409HDFC BANK05021006041000IQ04I0080108160220130413NOT DISCLOSED05020206075000000IQ04I0090108160320120409HDFC BANK05021006041000IQ04I0100108080320120413NOT DISCLOSED050210060550000IQ04I0110108240520080413NOT DISCLOSED050210060510000IQ04I0120108180420080409HDFC BANK0502050606800000IQ04I0130108050420080409HDFC BANK0502050606800000IQ04I0140108131220070413NOT DISCLOSED05020206071500000IQ04I0150108120420070413NOT DISCLOSED0502100606300000DR03D010108121120140225THIS IS A DISPUTE REMARKS0322DISPUTE REMARKS PART 2ES0700054120102**";

        int index, i,length = 0;
        String word = "ID03I0";
        List<Main> al=new ArrayList<Main>();
        for (i = -1; (i = str.indexOf(word, i-1 )) != -1; i++) {
            String IDnumber = "";
            String IDtype = "";
            String issueDate="";
            String expiryDate="";

         //   System.out.println(i);
            i = i + 7;
            String tag = str.substring(i, i + 2);
            if (tag.equals("01"))
            {
                i = i + 4;
                String demo = str.substring(i, i + 2);
                i = i + 2;
                if (demo.equals("01"))
                    IDtype = "Income Tax ID Number (PAN)";
                if (demo.equals("02"))
                    IDtype = "Passport Number";
                if (demo.equals("03"))
                    IDtype = "Voter ID Number";
                if (demo.equals("04"))
                    IDtype = "Driver’s License Number";
                if (demo.equals("05"))
                    IDtype = "Ration Card Number";
                if (demo.equals("06"))
                    IDtype = "Universal ID Number (UID)";

                //System.out.println("ID Type is: "+ IDtype);
                tag = str.substring(i, i + 2);
            }


            if (tag.equals("02")) {
                i = i + 2;
                length = Integer.parseInt(str.substring(i, i + 2));
                i = i + 2;
                IDnumber = IDnumber + str.substring(i, i + length);
                i = i + length;

                //System.out.println("ID number: "+IDnumber);
                tag=str.substring(i,i+2);
            }
            if(tag.equals("03")){

                i=i+4;
                issueDate=str.substring(i,i+8);
                i=i+8;

                //System.out.println("issue date: "+issueDate);
                tag=str.substring(i,i+2);
            }
            if(tag.equals("04")){

                i=i+4;
                expiryDate=str.substring(i,i+8);
                i=i+8;

                //System.out.println("issue date: "+issueDate);
                tag=str.substring(i,i+2);
            }
            al.add(new Main(IDnumber,IDtype,issueDate,expiryDate));

            }
        for(Main ob : al)
        {
            System.out.println(ob.IDnumber+" "+ob.IDtype);
        }
//          Iterator itr=al.iterator();
//        while(itr.hasNext()){
//            Main st=(Main) itr.next();
//            System.out.println("IDtype is:- "+st.IDtype+" IDnumber is:- "+st.IDnumber+"  issueDate is:-"+st.issueDate+" expiry Date is:-"+st.expiryDate);
//        }



    }
    }
