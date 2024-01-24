package paysage;


import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class TestApplication extends javafx.application.Application {


    public void start(Stage primaryStage) {
        Pane root = new Pane();

        // Créer le ciel
        Rectangle ciel = new Rectangle(800, 400, Color.SKYBLUE);
        root.getChildren().add(ciel);

        // Créer le sol
        Rectangle sol = new Rectangle(800, 200, Color.GREEN);
        sol.setY(400);
        root.getChildren().add(sol);

        // Créer le soleil
        Circle soleil = new Circle(100, Color.YELLOW);
        soleil.setCenterX(100);
        soleil.setCenterY(100);
        root.getChildren().add(soleil);

        // Créer la maison
        Rectangle maison = new Rectangle(200, 200, Color.BROWN);
        maison.setX(300);
        maison.setY(200);
        root.getChildren().add(maison);

        // Créer la porte
        Rectangle porte = new Rectangle(50, 100, Color.BROWN);
        porte.setX(350);
        porte.setY(300);
        root.getChildren().add(porte);

        // Créer la fenêtre
        Rectangle fenetre = new Rectangle(50, 50, Color.BROWN);
        fenetre.setX(450);
        fenetre.setY(250);
        root.getChildren().add(fenetre);

        // Créer le toit
        Polygon toit = new Polygon();
        toit.getPoints().addAll(new Double[]{300.0, 200.0, 500.0, 200.0, 400.0, 100.0});
        toit.setFill(Color.RED);
        root.getChildren().add(toit);

        // creer mare
        Circle mare = new Circle(100, Color.BLUE);
        mare.setCenterX(700);
        mare.setCenterY(500);
        mare.setRadius(100);

        root.getChildren().add(mare);


        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Paysage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}