module greengates.charity.app {
    requires javafx.controls;
    requires javafx.fxml;

    opens greengates.charity.app to javafx.fxml;
    exports greengates.charity.app;
}
