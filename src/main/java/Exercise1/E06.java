package Exercise1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class E06 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();

        MenuBar menuBar = new MenuBar();
        Menu menuFichier = new Menu("Fichier");
        Menu menuEdition = new Menu("Édition");
        Menu menuFormat = new Menu("Format");
        menuBar.getMenus().addAll(menuFichier, menuEdition, menuFormat);

        TextArea zoneTexte = new TextArea();

        ToggleButton boutonGras = new ToggleButton("Gras");
        ToggleButton boutonItalique = new ToggleButton("Italique");
        ToggleButton boutonSouligne = new ToggleButton("Souligné");
        HBox boiteBoutons = new HBox(10, boutonGras, boutonItalique, boutonSouligne);

        ComboBox<String> comboBoxPolice = new ComboBox<>();
        comboBoxPolice.getItems().addAll("Arial", "Times New Roman", "Courier New");

        ComboBox<Integer> comboBoxTaillePolice = new ComboBox<>();
        comboBoxTaillePolice.getItems().addAll(12, 14, 16, 18, 20);

        ColorPicker selecteurCouleur = new ColorPicker();

        VBox boiteFormatage = new VBox(10, comboBoxPolice, comboBoxTaillePolice, selecteurCouleur);
        boiteFormatage.setPadding(new Insets(10));

        borderPane.setTop(menuBar);
        borderPane.setCenter(zoneTexte);
        borderPane.setBottom(boiteBoutons);
        borderPane.setLeft(boiteFormatage);

        comboBoxPolice.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                zoneTexte.setFont(Font.font(comboBoxPolice.getValue()));
            }
        });

        comboBoxTaillePolice.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                zoneTexte.setFont(Font.font(zoneTexte.getFont().getName(), comboBoxTaillePolice.getValue()));
            }
        });

        selecteurCouleur.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                zoneTexte.setStyle("-fx-text-fill: " + versChaineRgb(selecteurCouleur.getValue()) + ";");
            }
        });

        boutonGras.setOnAction(e -> {
            if (boutonGras.isSelected()) {
                zoneTexte.setStyle("-fx-font-weight: " + "bold" + ";");
            } else zoneTexte.setStyle("-fx-font-weight: " + "normal" + ";");
        });

        boutonItalique.setOnAction(e -> {
            if (boutonItalique.isSelected()) {
                zoneTexte.setStyle("-fx-font-style: " + "italic" + ";");
            } else zoneTexte.setStyle("-fx-font-style: " + "normal" + ";");
        });

        boutonSouligne.setOnAction(e -> {
            if (boutonSouligne.isSelected()) {
                zoneTexte.setStyle("-fx-underline: true;");
            } else zoneTexte.setStyle("-fx-underline: false;");
        });

        Scene scene = new Scene(borderPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String versChaineRgb(Color c) {

        return String.format("#%02X%02X%02X",
                (int) (c.getRed() * 255),
                (int) (c.getGreen() * 255),
                (int) (c.getBlue() * 255));
    }
}