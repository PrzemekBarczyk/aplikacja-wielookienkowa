package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.mainmenu.MainMenuController;
import main.mainmenu.MainMenuModel;
import main.mainmenu.MainMenuView;

public class Main extends Application {

    private static Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {

        primaryStage = stage;
        primaryStage.setTitle("Aplikacja wielookienkowa");
        primaryStage.setScene(new MainMenuController(new MainMenuView(), new MainMenuModel()).getScene());
        primaryStage.show();
    }

    public static void setScene(Scene newScene) {
        primaryStage.setScene(newScene);
    }
}
