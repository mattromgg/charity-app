package greengates.charity.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.io.IOException;
import java.util.Arrays;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TabPane tabPane = new TabPane();
        //in this part we are creating the tabs for choosing whether to go into charity info or the add charity
        Tab tab1 = new Tab();
        tab1.setText("Charity Pane: ");
        tab1.setContent(new StackPane()); // Add content to the first tab
        StackPane contentPane5 = new StackPane();
        ScrollPane scrollPane = new ScrollPane();//adding a scroll feature
        scrollPane.setContent(CharityPane());//add the content for the pane the CharityPane class, checl below
        //we added a CharityInfo class, which prints all the info pertinant to the charity info
        scrollPane.setFitToWidth(true); // Allow the ScrollPane to resize horizontally, ensure it fits
        VBox tabContent = new VBox();
        tabContent.getChildren().addAll(contentPane5, scrollPane);//add all the contents to the actual pane
        tab1.setContent(tabContent);//set it


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

    public VBox Donors(){//this is the class and content for the donors pane
        Stage donorsStage = new Stage(); // Create a new stage
        VBox content = new VBox();

        List<String> donors = Arrays.asList("we dont have code for this yet, ");
        final ComboBox comboBox = new ComboBox();//combobox is the dropdown option, were defining a new dropdown

        // Mock data for donors
        Map<String, String[]> donorsData = new HashMap<>();
        donorsData.put("Donor A", new String[]{"John", "Doe", "123456789", "3"});
        donorsData.put("Donor B", new String[]{"Jane", "Smith", "987654321", "5"});
        donorsData.put("Donor C", new String[]{"Jim", "Brown", "456123789", "2"});

        // Mock data for donations
        Map<String, String[]> donationsData = new HashMap<>();
        donationsData.put("Donor A", new String[]{"01/01/2023, $100, Charity 1", "02/01/2023, $150, Charity 2"});
        donationsData.put("Donor B", new String[]{"01/02/2023, $200, Charity 3", "03/02/2023, $250, Charity 4"});
        donationsData.put("Donor C", new String[]{"04/01/2023, $300, Charity 5", "05/01/2023, $350, Charity 6"});

        ComboBox<String> donorComboBox = new ComboBox<>();
        donorComboBox.setPromptText("Select a donor");
        donorComboBox.getItems().addAll(donorsData.keySet());

        Label donorDetails = new Label();
        Label donationDetails = new Label();

        donorComboBox.setOnAction(event -> {
            String selectedDonor = donorComboBox.getSelectionModel().getSelectedItem();
            if (selectedDonor != null) {
                String[] donorInfo = donorsData.get(selectedDonor);
                donorDetails.setText("First Name: " + donorInfo[0] + "\n" +
                        "Last Name: " + donorInfo[1] + "\n" +
                        "Tax Number: " + donorInfo[2] + "\n" +
                        "Number of Donations: " + donorInfo[3]);

                String[] donations = donationsData.get(selectedDonor);
                StringBuilder donationsText = new StringBuilder("Donations:\n");
                for (String donation : donations) {
                    donationsText.append(donation).append("\n");
                }
                donationDetails.setText(donationsText.toString());
            }
        });

        content.getChildren().addAll(donorComboBox, donorDetails, donationDetails);
        return content;




        //comboBox.setPromptText("Select a donor ");//the text on top of the comboBox says select a donor
        //comboBox.getItems().addAll(donors);//for all the months defined in donor arraylist, add a dropdown option for each


        //StackPane root = new StackPane();
        //root.getChildren().addAll(comboBox);
        //StackPane.setAlignment(comboBox, javafx.geometry.Pos.TOP_CENTER);//set the comboBox position to the Top Center


        //Scene scene = new Scene(root, 400, 300);//width and length

        //Set the scene to the stage and show the stage
       //donorsStage.setScene(scene);
       //donorsStage.setTitle("Simple JavaFX Application");
       //donorsStage.show();
       //content.getChildren().add(root);
       //return content;


    }



    public static void main(String[] args) {
        launch();
    }
}
