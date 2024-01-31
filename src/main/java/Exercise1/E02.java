package Exercise1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class E02 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10);

        Button button1 = new Button("Bouton 1");
        Button button2 = new Button("Bouton 2");
        Button button3 = new Button("Bouton 3");

        flowPane.getChildren().addAll(button1, button2, button3);

        Scene scene = new Scene(flowPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}