package Exercise1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class E01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        Button buttonA = new Button("Bouton A");
        Button buttonB = new Button("Bouton B");
        Button buttonC = new Button("Bouton C");

        GridPane.setConstraints(buttonA, 0, 0);
        GridPane.setConstraints(buttonB, 1, 0);
        GridPane.setConstraints(buttonC, 0, 1);

        gridPane.getChildren().addAll(buttonA, buttonB, buttonC);

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}