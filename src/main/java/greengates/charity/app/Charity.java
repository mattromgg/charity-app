package greengates.charity.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
//this doesnt work
class Charity {
    ArrayList<String> allTheCharities = new ArrayList<>(Arrays.asList("Tagtune", "Wikibox", "Roombo", "Trudoo", "Yakitri", "Tagfeed", "Podcat", "Kwimbee", "Minyx", "Ntags", "Thoughtstorm", "Devpulse", "Kaymbo", "Jabbersphere", "Gigabox", "Meemm", "Gigazoom", "Dabvine", "Skilith", "Realcube", "Gabvine", "Pixoboo", "Skyble", "Babbleblab", "Shuffletag", "Thoughtsphere", "Centimia", "Snaptags", "Leenti", "Dynava", "Buzzster", "Twitterworks", "Shufflester", "DabZ", "Meezzy", "Eire", "Izio", "Photobean", "Yodoo"));
    //defining an arraylist for all the charaties
    static ArrayList<String> Tagtune = new ArrayList<>();
    static ArrayList<String> Wikibox = new ArrayList<>();
    static ArrayList<String> Roombo = new ArrayList<>();
    static ArrayList<String> Trudoo = new ArrayList<>();
    static ArrayList<String> Yakitri = new ArrayList<>();
    static ArrayList<String> Tagfeed = new ArrayList<>();
    static ArrayList<String> Podcat = new ArrayList<>();
    static ArrayList<String> Kwimbee = new ArrayList<>();
    static ArrayList<String> Minyx = new ArrayList<>();
    static ArrayList<String> Ntags = new ArrayList<>();
    static ArrayList<String> Thoughtstorm = new ArrayList<>();
    static ArrayList<String> Devpulse = new ArrayList<>();
    static ArrayList<String> Kaymbo = new ArrayList<>();
    static ArrayList<String> Jabbersphere = new ArrayList<>();
    static ArrayList<String> Gigabox = new ArrayList<>();
    static ArrayList<String> Meemm = new ArrayList<>();
    static ArrayList<String> Gigazoom = new ArrayList<>();
    static ArrayList<String> Dabvine = new ArrayList<>();
    static ArrayList<String> Skilith = new ArrayList<>();
    static ArrayList<String> Realcube = new ArrayList<>();
    static ArrayList<String> Gabvine = new ArrayList<>();
    static ArrayList<String> Pixoboo = new ArrayList<>();
    static ArrayList<String> Skyble = new ArrayList<>();
    static ArrayList<String> Babbleblab = new ArrayList<>();
    static ArrayList<String> Shuffletag = new ArrayList<>();
    static ArrayList<String> Thoughtsphere = new ArrayList<>();
    static ArrayList<String> Centimia = new ArrayList<>();
    static ArrayList<String> Snaptags = new ArrayList<>();
    static ArrayList<String> Leenti = new ArrayList<>();
    static ArrayList<String> Dynava = new ArrayList<>();
    static ArrayList<String> Buzzster = new ArrayList<>();
    static ArrayList<String> Twitterworks = new ArrayList<>();
    static ArrayList<String> Shufflester = new ArrayList<>();
    static ArrayList<String> DabZ = new ArrayList<>();
    static ArrayList<String> Meezzy = new ArrayList<>();
    static ArrayList<String> Eire = new ArrayList<>();
    static ArrayList<String> Izio = new ArrayList<>();
    static ArrayList<String> Photobean = new ArrayList<>();
    static ArrayList<String> Yodoo = new ArrayList<>();

    // Getters for individual charity lists, used in HelloApplication
    public static ArrayList<String> getTagtune() {return Tagtune;}
    public static ArrayList<String> getWikibox() {return Wikibox;}
    public static ArrayList<String> getRoombo() {return Roombo;}
    public static ArrayList<String> getTrudoo() {return Trudoo;}
    public static ArrayList<String> getYakitri() {return Yakitri;}
    public static ArrayList<String> getTagfeed() {return Tagfeed;}
    public static ArrayList<String> getPodcat() {return Podcat;}
    public static ArrayList<String> getKwimbee() {return Kwimbee;}
    public static ArrayList<String> getMinyx() {return Minyx;}
    public static ArrayList<String> getNtags() {return Ntags;}
    public static ArrayList<String> getThoughtstorm() {return Thoughtstorm;}
    public static ArrayList<String> getDevpulse() {return Devpulse;}
    public static ArrayList<String> getKaymbo() {return Kaymbo;}
    public static ArrayList<String> getJabbersphere() {return Jabbersphere;}
    public static ArrayList<String> getGigabox() {return Gigabox;}
    public static ArrayList<String> getMeemm() {return Meemm;}
    public static ArrayList<String> getGigazoom() {return Gigazoom;}
    public static ArrayList<String> getDabvine() {return Dabvine;}
    public static ArrayList<String> getSkilith() {return Skilith;}
    public static ArrayList<String> getRealcube() {return Realcube;}
    public static ArrayList<String> getGabvine() {return Gabvine;}
    public static ArrayList<String> getPixoboo() {return Pixoboo;}
    public static ArrayList<String> getSkyble() {return Skyble;}
    public static ArrayList<String> getBabbleblab() {return Babbleblab;}
    public static ArrayList<String> getShuffletag() {return Shuffletag;}
    public static ArrayList<String> getThoughtsphere() {return Thoughtsphere;}
    public static ArrayList<String> getCentimia() {return Centimia;}
    public static ArrayList<String> getSnaptags() {return Snaptags;}
    public static ArrayList<String> getLeenti() {return Leenti;}
    public static ArrayList<String> getDynava() {return Dynava;}
    public static ArrayList<String> getBuzzster() {return Buzzster;}
    public static ArrayList<String> getTwitterworks() {return Twitterworks;}
    public static ArrayList<String> getShufflester() {return Shufflester;}
    public static ArrayList<String> getDabZ() {return DabZ;}
    public static ArrayList<String> getMeezzy() {return Meezzy;}
    public static ArrayList<String> getEire() {return Eire;}
    public static ArrayList<String> getIzio() {return Izio;}
    public static ArrayList<String> getPhotobean() {return Photobean;}
    public static ArrayList<String> getYodoo() {return Yodoo;}
    private String charityName;


    public Charity() {
        this.charityName = charityName;
    }

    public String getCharityName() {
        return charityName;
    }
    //this will split the charity then the month, hopefully lol
    public static ArrayList<String> splitCharity_Month(ArrayList<String> selectedList) {
        String line;

        ///change the '...' to the name of your computer? i think, as in im paigetimmeny
        String csvFile = "/Users/.../IdeaProjects/charity-app/src/main/resources/greengates/charity/app/Final.csv";
        ReadCSV readCSV = new ReadCSV(csvFile);
        readCSV.read();
        List<List<String>> donations = readCSV.getDonations();

        //String csvFile = "CSV File"; // this is actually defining the CSV File, its calling it and giving it a name of CSV File
        List<List<String>> records = new ArrayList<>(); //this creates an array of Strings named 'records'

        String[] data; //definng a list of Strings named data
        // Constructor

        Scanner scanner = null;
        try {
            ///change the '...' to the name of your computer? i think, as in im paigetimmeny
            scanner = new Scanner(new File("/Users/.../IdeaProjects/charity-app/src/main/resources/greengates/charity/app/Final.csv"));//defining path for CSV File, making sure it exists
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanner.hasNext()) {
            line = scanner.nextLine();  // Read a line, while it has a next line continue reading

            if (line.contains("Tagtune")) {///super inefficient, however, because i need getters for App, hashmap method wouldnt wprk,
                Tagtune.add(line + "*");
            }
            if (line.contains("Wikibox")) {
                Wikibox.add(line + "\n");
            }
            if (line.contains("Roombo")) {
                Roombo.add(line + "\n");
            }
            if (line.contains("Trudoo")) {
                Trudoo.add(line + "\n");
            }
            if (line.contains("Yakitri")) {
                Yakitri.add(line + "\n");
            }
            if (line.contains("Tagfeed")) {
                Tagfeed.add(line + "\n");
            }
            if (line.contains("Podcat")) {
                Podcat.add(line + "\n");
            }
            if (line.contains("Kwimbee")) {
                Kwimbee.add(line + "\n");
            }
            if (line.contains("Minyx")) {
                Minyx.add(line + "\n");
            }
            if (line.contains("Ntags")) {
                Ntags.add(line + "*");
            }
            if (line.contains("Thoughtstorm")) {
                Thoughtstorm.add(line + "\n");
            }
            if (line.contains("Devpulse")) {
                Devpulse.add(line + "\n");
            }
            if (line.contains("Kaymbo")) {
                Kaymbo.add(line + "\n");
            }
            if (line.contains("Jabbersphere")) {
                Jabbersphere.add(line + "\n");
            }
            if (line.contains("Gigabox")) {
                Gigabox.add(line + "\n");
            }
            if (line.contains("Meemm")) {
                Meemm.add(line + "\n");
            }
            if (line.contains("Gigazoom")) {
                Gigazoom.add(line + "\n");
            }
            if (line.contains("Dabvine")) {
                Dabvine.add(line + "\n");
            }
            if (line.contains("Skilith")) {
                Skilith.add(line + "\n");
            }
            if (line.contains("Realcube")) {
                Realcube.add(line + "\n");
            }
            if (line.contains("Gabvine")) {
                Gabvine.add(line + "\n");
            }
            if (line.contains("Pixoboo")) {
                Pixoboo.add(line + "\n");
            }
            if (line.contains("Skyble")) {
                Skyble.add(line + "\n");
            }
            if (line.contains("Babbleblab")) {
                Babbleblab.add(line + "\n");
            }
            if (line.contains("Shuffletag")) {
                Shuffletag.add(line + "\n");
            }
            if (line.contains("Thoughtsphere")) {
                Thoughtsphere.add(line + "\n");
            }
            if (line.contains("Centimia")) {
                Centimia.add(line + "\n");
            }
            if (line.contains("Snaptags")) {
                Snaptags.add(line + "\n");
            }
            if (line.contains("Leenti")) {
                Leenti.add(line + "\n");
            }
            if (line.contains("Dynava")) {
                Dynava.add(line + "\n");
            }
            if (line.contains("Buzzster")) {
                Buzzster.add(line + "*");
            }
            if (line.contains("Twitterworks")) {
                Twitterworks.add(line + "\n");
            }
            if (line.contains("Shufflester")) {
                Shufflester.add(line + "\n");
            }
            if (line.contains("DabZ")) {
                DabZ.add(line + "\n");
            }
            if (line.contains("Meezzy")) {
                Meezzy.add(line + "\n");
            }
            if (line.contains("Eire")) {
                Eire.add(line + "\n");
            }
            if (line.contains("Izio")) {
                Izio.add(line + "\n");
            }
            if (line.contains("Photobean")) {
                Photobean.add(line + "\n");
            }
            if (line.contains("Yodoo")) {
                Yodoo.add(line + "\n"); //we are adding the . because it doesnt exist, and we are using it to split each line of the code
                // to be used in the next part to tell the computer this is where we're splitting the line
            }
        }
        scanner.close();
        return selectedList;


    }
   public static ArrayList<ArrayList> SplitMonths(ArrayList<String> selectedList){

    ArrayList<ArrayList> allMonths = null;
    ArrayList<String> January = new ArrayList<>(); January.add("Jan: ");
    ArrayList<String> February = new ArrayList<>(); February.add("Feb: ");
    ArrayList<String> March = new ArrayList<>(); March.add("Mar: ");
    ArrayList<String> April = new ArrayList<>(); April.add("Apr: ");
    ArrayList<String> May = new ArrayList<>(); May.add("May: ");
    ArrayList<String> June = new ArrayList<>(); June.add("Jun: ");
    ArrayList<String> July = new ArrayList<>(); July.add("Jul: ");
    ArrayList<String> August = new ArrayList<>(); August.add("Aug: ");
    ArrayList<String> September = new ArrayList<>(); September.add("Sep: ");
    ArrayList<String> October = new ArrayList<>(); October.add("Oct: ");
    ArrayList<String> November = new ArrayList<>(); November.add("Nov: ");
    ArrayList<String> December = new ArrayList<>(); November.add("Dec: ");

    for (String splitElement : selectedList) { //input list is the same thing as individual in the others, its just the charity list
        String[] splitElements = splitElement.split("\\s+");  // Split by whitespace
        // Iterate over split elements
        for (String element : splitElements) {
            if (element.contains("01/") || element.contains("1/")) {January.add(element + "*");
            } else if (element.contains("02/") || element.contains("2/")) { February.add(element + "*");
            } else if (element.contains("03/") || element.contains("3/")) {March.add(element + "*");
            } else if (element.contains("04/") || element.contains("4/")) {April.add(element + "*");
            } else if (element.contains("05/") || element.contains("5/")) {May.add(element + "*");
            } else if (element.contains("06/") || element.contains("6/")) {June.add(element + "*");
            } else if (element.contains("07/") || element.contains("7/")) {July.add(element + "*");
            } else if (element.contains("08/") || element.contains("8/")) {August.add(element + "*");
            } else if (element.contains("09/") || element.contains("9/")) {September.add(element + "*");
            } else if (element.contains("10/")) {October.add(element + "*");
            } else if (element.contains("11/")) {November.add(element + "*");//the * bcs how we identify the next value used to split the code in the splitByCharityInsideMonth class
            } else if (element.contains("12/")) {December.add(element + "*");}
        }

        allMonths = new ArrayList<>();//creating an arraylist of all the months, so we can return all the months
        allMonths.add(January);
        allMonths.add(February);
        allMonths.add(March);
        allMonths.add(April);
        allMonths.add(May);
        allMonths.add(June);
        allMonths.add(July);
        allMonths.add(August);
        allMonths.add(September);
        allMonths.add(October);
        allMonths.add(November);
        allMonths.add(December);
    }

    return allMonths;//returns all the months
        // return selectedList;//the selectedList is the one we will choose ourselvs, used in HeloApplication
        // System.out.println(Yodoo);
        }
}