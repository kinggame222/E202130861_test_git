module E.test.git {
    requires javafx.controls;
    requires javafx.fxml;


    opens Exercise1 to javafx.fxml;
    exports Exercise1;

    opens paysage to javafx.fxml;

    exports paysage;


}