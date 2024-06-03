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


    public void NewPane(String charity) {

        switch (charity) {
            case "Tagtune":
                selectedList = Charity.getTagtune();
                break;
            case "Wikibox":
                selectedList = Charity.getWikibox();
                break;
            case "Roombo":
                selectedList = Charity.getRoombo();
                break;
            case "Trudoo":
                selectedList = Charity.getTrudoo();
                break;
            case "Yakitri":
                selectedList = Charity.getYakitri();
                break;
            case "Tagfeed":
                selectedList = Charity.getTagfeed();
                break;
            case "Podcat":
                selectedList = Charity.getPodcat();
                break;
            case "Kwimbee":
                selectedList = Charity.getKwimbee();
                break;
            case "Minyx":
                selectedList = Charity.getMinyx();
                break;
            case "Ntags":
                selectedList = Charity.getNtags();
                break;
            case "Thoughtstorm":
                selectedList = Charity.getThoughtstorm();
                break;
            case "Devpulse":
                selectedList = Charity.getDevpulse();
                break;
            case "Kaymbo":
                selectedList = Charity.getKaymbo();
                break;
            case "Jabbersphere":
                selectedList = Charity.getJabbersphere();
                break;
            case "Gigabox":
                selectedList = Charity.getGigabox();
                break;
            case "Meemm":
                selectedList = Charity.getMeemm();
                break;
            case "Gigazoom":
                selectedList = Charity.getGigazoom();
                break;
            case "Dabvine":
                selectedList = Charity.getDabvine();
                break;
            case "Skilith":
                selectedList = Charity.getSkilith();
                break;
            case "Realcube":
                selectedList = Charity.getRealcube();
                break;
            case "Gabvine":
                selectedList = Charity.getGabvine();
                break;
            case "Pixoboo":
                selectedList = Charity.getPixoboo();
                break;
            case "Skyble":
                selectedList = Charity.getSkyble();
                break;
            case "Babbleblab":
                selectedList = Charity.getBabbleblab();
                break;
            case "Shuffletag":
                selectedList = Charity.getShuffletag();
                break;
            case "Thoughtsphere":
                selectedList = Charity.getThoughtsphere();
                break;
            case "Centimia":
                selectedList = Charity.getCentimia();
                break;
            case "Snaptags":
                selectedList = Charity.getSnaptags();
                break;
            case "Leenti":
                selectedList = Charity.getLeenti();
                break;
            case "Dynava":
                selectedList = Charity.getDynava();
                break;
            case "Buzzster":
                selectedList = Charity.getBuzzster();
                break;
            case "Twitterworks":
                selectedList = Charity.getTwitterworks();
                break;
            case "Shufflester":
                selectedList = Charity.getShufflester();
                break;
            case "DabZ":
                selectedList = Charity.getDabZ();
                break;
            case "Meezzy":
                selectedList = Charity.getMeezzy();
                break;
            case "Eire":
                selectedList = Charity.getEire();
                break;
            case "Izio":
                selectedList = Charity.getIzio();
                break;
            case "Photobean":
                selectedList = Charity.getPhotobean();
                break;
            case "Yodoo":
                selectedList = Charity.getYodoo();
                break;
        }


        Stage newStage0 = new Stage(); // Create a new stage
        BorderPane newPane0 = new BorderPane();
        newPane0.setTop(new Label("You are currently viewing the charity: " + charity));
        newPane0.setTop(new Label("This is so ugly, but for each month it displays info on the selected charity" ));
        newPane0.setTop(new Label("Each index [] is a new month" ));

        ArrayList<String> individual1 = Charity.splitCharity_Month(selectedList);
        ArrayList<ArrayList> individual2 = Charity.SplitMonths(individual1);
        String individual3 = "This is so ugly, but for each month it displays info on the selected charity";

        Label infoLabel = new Label(individual2.toString());
        Label infoLabel_one = new Label(individual3);

        StackPane contentPane = new StackPane();
        contentPane.getChildren().addAll(infoLabel_one, infoLabel);


        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(contentPane);
        //scrollPane.setFitToWidth(true); // Allow the ScrollPane to resize horizontally

        VBox mainContent = new VBox();
        mainContent.getChildren().add(scrollPane);

        newPane0.setCenter(mainContent);

        Scene scene0 = new Scene(newPane0, 400, 300); // Add everything together + define length + width

        // Set the scene and show the stage
        newStage0.setScene(scene0);
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