module com.example.e202130861_test_git {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.e202130861_test_git to javafx.fxml;
    exports com.example.e202130861_test_git;
}