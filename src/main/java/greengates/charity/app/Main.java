package greengates.charity.app;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

///change the '...' to the name of your computer? i think, as in im paigetimmeny
        String fileName = "/Users/.../IdeaProjects/charity-app/src/main/resources/greengates/charity/app/Final.csv";
        ReadCSV readCSV = new ReadCSV(fileName);
        readCSV.read();
        List<List<String>> donations = readCSV.getDonations();
        Charity charity = new Charity();
        ArrayList<String> months = Charity.getYodoo();
        System.out.println(charity.splitCharity_Month(months));

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



