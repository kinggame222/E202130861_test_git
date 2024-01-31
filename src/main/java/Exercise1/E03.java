package Exercise1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class E03 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox();

        Button buttonX = new Button("Bouton X");
        Button buttonY = new Button("Bouton Y");
        Button buttonZ = new Button("Bouton Z");

        vbox.getChildren().addAll(buttonX, buttonY, buttonZ);

        HBox hbox = new HBox();
        Button okButton = new Button("OK");
        Button cancelButton = new Button("Annuler");

        hbox.getChildren().addAll(okButton, cancelButton);

        vbox.getChildren().add(hbox);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}