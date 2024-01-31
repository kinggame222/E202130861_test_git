package Exercise1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E05 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StackPane stackPane = new StackPane();

        Text textTop = new Text("En haut");
        Text textMiddle = new Text("Au milieu");
        Text textBottom = new Text("En bas");

        Rectangle rectangle = new Rectangle(100, 50, Color.BLUE);

        stackPane.getChildren().addAll(rectangle, textMiddle);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(textTop);
        borderPane.setCenter(stackPane);
        borderPane.setBottom(textBottom);
        BorderPane.setAlignment(textTop, Pos.CENTER);
        BorderPane.setAlignment(textBottom, Pos.CENTER);


        Scene scene = new Scene(borderPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}