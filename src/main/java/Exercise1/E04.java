package Exercise1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class E04 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        AnchorPane anchorPane = new AnchorPane();

        Button buttonClickHere = new Button("Cliquez ici");
        AnchorPane.setTopAnchor(buttonClickHere, 10.0);
        AnchorPane.setLeftAnchor(buttonClickHere, 10.0);

        TextField textField = new TextField();
        AnchorPane.setTopAnchor(textField, 100.0);
        AnchorPane.setLeftAnchor(textField, 100.0);
        AnchorPane.setRightAnchor(textField, 100.0);

        Button buttonValidate = new Button("Valider");
        AnchorPane.setBottomAnchor(buttonValidate, 10.0);
        AnchorPane.setRightAnchor(buttonValidate, 10.0);

        anchorPane.getChildren().addAll(buttonClickHere, textField, buttonValidate);

        Scene scene = new Scene(anchorPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}