package greengates.charity.app;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String fileName = "/Users/paigetimmeny/IdeaProjects/charity-app/src/main/resources/greengates/charity/app/Final.csv";
        ReadCSV readCSV = new ReadCSV(fileName);
        readCSV.read();
        List<List<String>> donations = readCSV.getDonations();



        ArrayList<Donation> userDonations = new ArrayList<Donation>();

        for (List<String> donation : donations) {
            if (donations.indexOf(donation) != 0) {
                String[] recordArray = donation.toArray(new String[0]);
                Donation userDonation = new Donation(recordArray);
                userDonations.add(userDonation);
            }
        }

        retrieveUserDonation(userDonations);


    }

    public static void retrieveUserDonation(ArrayList<Donation> donations) {
        ArrayList<Donation> individualDonations = new ArrayList<Donation>();
        for (Donation donation : donations) {
            System.out.println(donation.getId());
        }

    }


}