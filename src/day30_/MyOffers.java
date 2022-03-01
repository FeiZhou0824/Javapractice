package day30_;

import java.util.ArrayList;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("DC", "CGTN","QA", 120000,true,true,true,true);

        Offer offer2 = new Offer();
        offer2.setInfo("MD","Apple","SDET",150000,true,false,true,false);

        Offer offer3 = new Offer();
        offer3.setInfo("VA","Google","SDET",150000,true,true,false,true);

        Offer offer4 = new Offer();
        offer4.setInfo("Florida", "Uber", "SDET", 125000, true,true,true,true);

        Offer offer5 = new Offer();
        offer5.setInfo("CA","facebook","SDET",170000,true, true,false,true);

        Offer offer6 = new Offer();
        offer6.setInfo("South Carolina", "Lift", "SDET",120000, false,false,false,false);

        Offer offer7 = new Offer();
        offer7 .setInfo("New York", "AMAZON","SDET",180000, true, true, true, true);

        Offer [] offers ={ offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        for (Offer offer : offers) {

            if(offer.isFullTime==true){
                System.out.println(offer);
            }

        }






    }
}
