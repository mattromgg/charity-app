//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package greengates.charity.app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {
    @FXML
    private Label welcomeText;

    public PrimaryController() {
    }

    @FXML
    protected void onHelloButtonClick() {
        this.welcomeText.setText("Welcome to JavaFX Application!");
    }
}
