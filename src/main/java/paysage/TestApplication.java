package paysage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TestApplication extends Application {

    private static final int SCENE_WIDTH = 800;
    private static final int SCENE_HEIGHT = 600;

    public void start(Stage primaryStage) {
        Pane root = new Pane();

        createSky(root);
        createGround(root);
        createSun(root);
        createHouse(root);
        createPond(root);
        createCamel(root);

        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setTitle("Paysage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void createSky(Pane root) {
        Rectangle sky = new Rectangle(SCENE_WIDTH, SCENE_HEIGHT / 2, Color.SKYBLUE);
        root.getChildren().add(sky);
    }

    private void createGround(Pane root) {
        Rectangle ground = new Rectangle(SCENE_WIDTH, SCENE_HEIGHT / 2, Color.GREEN);
        ground.setY(SCENE_HEIGHT / 2);
        root.getChildren().add(ground);
    }

    private void createSun(Pane root) {
        Circle sun = new Circle(100, Color.YELLOW);
        sun.setCenterX(100);
        sun.setCenterY(100);
        root.getChildren().add(sun);
    }

    private void createHouse(Pane root) {
        Rectangle house = new Rectangle(200, 200, Color.BROWN);
        house.setX(300);
        house.setY(200);
        root.getChildren().add(house);

        Rectangle door = new Rectangle(50, 100, Color.BROWN);
        door.setX(350);
        door.setY(300);
        root.getChildren().add(door);

        Rectangle window = new Rectangle(50, 50, Color.BROWN);
        window.setX(450);
        window.setY(250);
        root.getChildren().add(window);

        Polygon roof = new Polygon();
        roof.getPoints().addAll(new Double[]{300.0, 200.0, 500.0, 200.0, 400.0, 100.0});
        roof.setFill(Color.RED);
        root.getChildren().add(roof);
    }

    private void createPond(Pane root) {
        Circle pond = new Circle(100, Color.BLUE);
        pond.setCenterX(700);
        pond.setCenterY(500);
        root.getChildren().add(pond);
    }

    private void createCamel(Pane root) {
        //Dromadaire
        Rectangle camelBody = new Rectangle(50, 30, Color.LIGHTGOLDENRODYELLOW);
        camelBody.setX(500);
        camelBody.setY(380);
        root.getChildren().add(camelBody);

        Rectangle camelHead = new Rectangle(30, 30, Color.LIGHTGOLDENRODYELLOW);
        camelHead.setX(530);
        camelHead.setY(350);
        root.getChildren().add(camelHead);

        Circle camelEye = new Circle(535, 365, 3, Color.BLACK);
        root.getChildren().add(camelEye);

        Rectangle camelLeg1 = new Rectangle(500, 410, 10, 20, Color.LIGHTGOLDENRODYELLOW);
        root.getChildren().add(camelLeg1);

        Rectangle camelLeg2 = new Rectangle(540, 410, 10, 20, Color.LIGHTGOLDENRODYELLOW);
        root.getChildren().add(camelLeg2);
    }

    public static void main(String[] args) {
        launch();
    }
}
