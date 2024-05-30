package greengates.charity.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.io.IOException;
import java.util.Arrays;

public class App extends Application {
    Charity charity_two = new Charity();
    private ArrayList<String> selectedList;
    private List<String> charities;
    private String selectedCharity;
    @Override

    public void start(Stage stage) throws IOException {
        //the switch is saying when you select a charity, make the selectedList the arrayList of that charity, we will use  selectedList later on
        // its saying if youre in ".." charity, make the selectedList value the arraylist of that charity


        //in this part we are creating the tabs for choosing whether to go into charity info or the add charity
        Tab tab1 = new Tab();
        tab1.setText("Charity: ");
        tab1.setContent(new StackPane()); // Add content to the first tab
        StackPane contentPane5 = new StackPane();
        ScrollPane scrollPane = new ScrollPane();//adding a scroll feature
        scrollPane.setContent(CharityInfo());//add the content for the pane the CharityInfo class, checl below
        //we added a CharityInfo class, which prints all the info pertinant to the charity info
        scrollPane.setFitToWidth(true); // Allow the ScrollPane to resize horizontally, ensure it fits
        VBox tabContent = new VBox();
        tabContent.getChildren().addAll(contentPane5, scrollPane);//add all the contents to the actual pane
        tab1.setContent(tabContent);//set it
        TabPane tabPane = new TabPane();


//same principle as above, we're creating a new pane, its contents are taken from the AddDonation class
        // new tab, add donation
        Tab tab2 = new Tab();
        tab2.setText("Add Donation: ");
        tab2.setContent(new StackPane()); // Add content to the first tab
        StackPane contentPane2 = new StackPane();
        ScrollPane scrollPane2 = new ScrollPane();
        scrollPane2.setContent(AddDonation());//setting the content in this tab to the stuff we created inside AddDonation class, check below
        scrollPane2.setFitToWidth(true); // Allow the ScrollPane to resize horizontally
        VBox tabContent2 = new VBox();
        tabContent2.getChildren().addAll(contentPane2, scrollPane2);
        tab2.setContent(tabContent2);

        //add donor tab
        Tab tab3 = new Tab();
        tab3.setText("Donors: ");
        tab3.setContent(new StackPane()); // Add content to the first tab
        StackPane contentPane3 = new StackPane();
        ScrollPane scrollPane3 = new ScrollPane();
        scrollPane3.setContent(Donors());//setting the content in this tab to the stuff we created inside AddDonation class, check below
        scrollPane3.setFitToWidth(true); // Allow the ScrollPane to resize horizontally
        VBox tabContent3 = new VBox();
        tabContent3.getChildren().addAll(contentPane3, scrollPane3);
        tab3.setContent(tabContent3);



        tabPane.getTabs().addAll(tab1, tab2, tab3);//adding the tabs to the page
        Scene scene = new Scene(tabPane, 400, 300);//defining how large panes are

        // Set the scene to the stage and show the stage
        stage.setScene(scene);
        stage.setTitle("Charity Application (workkk) ");
        stage.show();//show everything
    }

    public VBox CharityPane(){//charity info class, which is under tab1, used in line:  scrollPane.setContent(Charity{ane}());

        Stage charityInfoStage = new Stage(); // Create a new stage
        VBox content = new VBox();

        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        final ComboBox comboBox = new ComboBox();//combobox is the dropdown option, were defining a new dropdown


        comboBox.setPromptText("Select a month ");//the text on top of the comboBox says select a month

        comboBox.getItems().addAll(months);//for all the months defined in months arraylist, add a dropdown option for each

        StackPane root = new StackPane();
        root.getChildren().addAll(comboBox);
        StackPane.setAlignment(comboBox, javafx.geometry.Pos.TOP_CENTER);//set the comboBox position to the Top Center

        Scene scene = new Scene(root, 400, 300);//width and length

        // Set the scene to the stage and show the stage
        charityInfoStage.setScene(scene);
        charityInfoStage.setTitle("Simple JavaFX Application");
        charityInfoStage.show();
        content.getChildren().add(root);
        return content;
    }

    public VBox AddDonation( ) {
        VBox content = new VBox();

        // Creating all the label texts
        Label firstNameLabel = new Label("First Name: ");
        Label lastNameLabel = new Label("Last Name: ");
        Label emailLabel = new Label("Email:");
        Label addressLabel = new Label("Address: ");
        Label taxNumberLabel = new Label("Tax Number: ");


        // create a textfeild for each label
        TextField firstNameTextField = new TextField();
        TextField lastNameTextField = new TextField();
        TextField emailTextField = new TextField();
        TextField addressTextField = new TextField();
        TextField taxNumberField = new TextField();


        //submit button
        Button submitButton = new Button("Submit Donation");
        content.getChildren().add(submitButton);

        List<String> charities = new ArrayList<>(Arrays.asList(
                "Tagtune", "Wikibox", "Roombo", "Trudoo", "Yakitri", "Tagfeed", "Podcat", "Kwimbee", "Minyx",
                "Ntags", "Thoughtstorm", "Devpulse", "Kaymbo", "Jabbersphere", "Gigabox", "Meemm", "Gigazoom",
                "Dabvine", "Skilith", "Realcube", "Gabvine", "Pixoboo", "Skyble", "Babbleblab", "Shuffletag",
                "Thoughtsphere", "Centimia", "Snaptags", "Leenti", "Dynava", "Buzzster", "Twitterworks", "Shufflester",
                "DabZ", "Meezzy", "Eire", "Izio", "Photobean", "Yodoo"
        ));

        final ComboBox comboBoxInSelecting = new ComboBox();//again a dropdown is being created
        comboBoxInSelecting.setPromptText("Select a charity");//text on top of the dropdown
        comboBoxInSelecting.getItems().addAll(charities);//add all the charaties (which we defined above) to the dropdown, same thing as how we created last dropdown

        StackPane root = new StackPane();
        root.getChildren().add(comboBoxInSelecting);

        final Label errorLabel = new Label();//setting the errorLabel, it needs to be outside of the submitButton.setOnAction(event -> {
        errorLabel.setTextFill(Color.RED);

        content.getChildren().addAll(root, firstNameLabel, firstNameTextField, lastNameLabel, lastNameTextField, emailLabel, emailTextField, addressLabel, addressTextField, taxNumberLabel, taxNumberField);

        return content;
    }
    public VBox CharityInfo(){//charity info class, which is under tab1, used in line:  scrollPane.setContent(CharityInfo());
        Stage charityInfoStage = new Stage(); // Create a new stage
        VBox content = new VBox();


        charities = Arrays.asList(   "Tagtune", "Wikibox", "Roombo", "Trudoo", "Yakitri", "Tagfeed", "Podcat", "Kwimbee", "Minyx",
                "Ntags", "Thoughtstorm", "Devpulse", "Kaymbo", "Jabbersphere", "Gigabox", "Meemm", "Gigazoom",
                "Dabvine", "Skilith", "Realcube", "Gabvine", "Pixoboo", "Skyble", "Babbleblab", "Shuffletag",
                "Thoughtsphere", "Centimia", "Snaptags", "Leenti", "Dynava", "Buzzster", "Twitterworks", "Shufflester",
                "DabZ", "Meezzy", "Eire", "Izio", "Photobean", "Yodoo"
        );
        final ComboBox comboBox = new ComboBox();//combobox is the dropdown option, were defining a new dropdown
        //titles comboBox

        comboBox.setPromptText("Select a charity");//the text on top of the comboBox is select a charity

        comboBox.getItems().addAll(charities);//for all the charaties defined in charaties arraylist, add a dropdown option for each

        StackPane root = new StackPane();
        root.getChildren().addAll(comboBox);
        StackPane.setAlignment(comboBox, javafx.geometry.Pos.TOP_CENTER);//set the comboBox position to the Top Center
        // Scene scene = new Scene(tabPane, 400, 300);

        Scene scene = new Scene(root, 400, 300);//width and length

        comboBox.setOnAction(e -> {//when the combobox is clicked...
            String selectedValue = (String) comboBox.getValue(); // Get the selected value from the ComboBox, what option did you clidk, what value, as in is it Shufflester (a charity option)

            // Update selectedCharity when the ComboBox value changes
            selectedCharity = selectedValue;

            // Call NewPane method with the updated selectedCharity, when its selected, call NewPane, which is a class we created below, which will open a new pane
            NewPane(selectedCharity);
        });


        // Set the scene to the stage and show the stage
        charityInfoStage.setScene(scene);
        charityInfoStage.setTitle("Simple JavaFX Application");
        charityInfoStage.show();
        content.getChildren().add(root);
        return content;
    }


    public void NewPane(String charity){
        switch (charity) {
            case "Tagtune":
                selectedList = charity_two.getTagtune();
                break;
            case "Wikibox":
                selectedList = charity_two.getWikibox();
                break;
            case "Roombo":
                selectedList = charity_two.getRoombo();
                break;
            case "Trudoo":
                selectedList = charity_two.getTrudoo();
                break;
            case "Yakitri":
                selectedList = charity_two.getYakitri();
                break;
            case "Tagfeed":
                selectedList = charity_two.getTagfeed();
                break;
            case "Podcat":
                selectedList = charity_two.getPodcat();
                break;
            case "Kwimbee":
                selectedList = charity_two.getKwimbee();
                break;
            case "Minyx":
                selectedList = charity_two.getMinyx();
                break;
            case "Ntags":
                selectedList = charity_two.getNtags();
                break;
            case "Thoughtstorm":
                selectedList = charity_two.getThoughtstorm();
                break;
            case "Devpulse":
                selectedList = charity_two.getDevpulse();
                break;
            case "Kaymbo":
                selectedList = charity_two.getKaymbo();
                break;
            case "Jabbersphere":
                selectedList = charity_two.getJabbersphere();
                break;
            case "Gigabox":
                selectedList = charity_two.getGigabox();
                break;
            case "Meemm":
                selectedList = charity_two.getMeemm();
                break;
            case "Gigazoom":
                selectedList = charity_two.getGigazoom();
                break;
            case "Dabvine":
                selectedList = charity_two.getDabvine();
                break;
            case "Skilith":
                selectedList = charity_two.getSkilith();
                break;
            case "Realcube":
                selectedList = charity_two.getRealcube();
                break;
            case "Gabvine":
                selectedList = charity_two.getGabvine();
                break;
            case "Pixoboo":
                selectedList = charity_two.getPixoboo();
                break;
            case "Skyble":
                selectedList = charity_two.getSkyble();
                break;
            case "Babbleblab":
                selectedList = charity_two.getBabbleblab();
                break;
            case "Shuffletag":
                selectedList = charity_two.getShuffletag();
                break;
            case "Thoughtsphere":
                selectedList = charity_two.getThoughtsphere();
                break;
            case "Centimia":
                selectedList = charity_two.getCentimia();
                break;
            case "Snaptags":
                selectedList = charity_two.getSnaptags();
                break;
            case "Leenti":
                selectedList = charity_two.getLeenti();
                break;
            case "Dynava":
                selectedList = charity_two.getDynava();
                break;
            case "Buzzster":
                selectedList = charity_two.getBuzzster();
                break;
            case "Twitterworks":
                selectedList = charity_two.getTwitterworks();
                break;
            case "Shufflester":
                selectedList = charity_two.getShufflester();
                break;
            case "DabZ":
                selectedList = charity_two.getDabZ();
                break;
            case "Meezzy":
                selectedList = charity_two.getMeezzy();
                break;
            case "Eire":
                selectedList = charity_two.getEire();
                break;
            case "Izio":
                selectedList = charity_two.getIzio();
                break;
            case "Photobean":
                selectedList = charity_two.getPhotobean();
                break;
            case "Yodoo":
                selectedList = charity_two.getYodoo();
                break;
        }

        Stage newStage0 = new Stage(); // Create a new stage
        BorderPane newPane0 = new BorderPane();
        newPane0.setTop(new Label("The are currently viewing the charity: " + charity));

        TabPane tabPane0 = new TabPane();
        Tab tab0 = new Tab();
        tab0.setText("Charity Pane: ");
        tab0.setContent(new StackPane());
        ArrayList<ArrayList> individual1 = charity_two.splitCharity_Month(selectedList);
        Label addressLabel1 = new Label(individual1.toString());
        StackPane contentPane0 = new StackPane();
        contentPane0.getChildren().add(addressLabel1);
        ScrollPane scrollPane0 = new ScrollPane();
        scrollPane0.setContent(CharityPane());
        scrollPane0.setFitToWidth(true);
        VBox tabContent0 = new VBox();
        tabContent0.getChildren().addAll(contentPane0, scrollPane0);
        tab0.setContent(tabContent0);

        tabPane0.getTabs().addAll(tab0);//adding all the tabs to the TabPane

        Scene scene0 = new Scene(tabPane0, 400, 300);//add everything together + define length + wodth
        // Set the scene and show the stage

        newStage0.setScene(scene0);
        //newStage.setTitle(charity);
        newStage0.show();
    }



    public VBox Donors(){//this is the class and content for the donors pane
        Stage donorsStage = new Stage(); // Create a new stage
        VBox content = new VBox();

        List<String> donors = Arrays.asList("we dont have code for this yet, ");
        final ComboBox comboBox = new ComboBox();//combobox is the dropdown option, were defining a new dropdown


        comboBox.setPromptText("Select a donor ");//the text on top of the comboBox says select a donor
        comboBox.getItems().addAll(donors);//for all the months defined in donor arraylist, add a dropdown option for each


        StackPane root = new StackPane();
        root.getChildren().addAll(comboBox);
        StackPane.setAlignment(comboBox, javafx.geometry.Pos.TOP_CENTER);//set the comboBox position to the Top Center


        Scene scene = new Scene(root, 400, 300);//width and length

        // Set the scene to the stage and show the stage
        donorsStage.setScene(scene);
        donorsStage.setTitle("Simple JavaFX Application");
        donorsStage.show();
        content.getChildren().add(root);
        return content;
    }


    public static void main(String[] args) {
        launch();
    }
}