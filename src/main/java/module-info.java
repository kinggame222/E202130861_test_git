module com.example.e202130861_test_git {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.example.e202130861_test_git to javafx.fxml;

    exports paysage to javafx.graphics;
}