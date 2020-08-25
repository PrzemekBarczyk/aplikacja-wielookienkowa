package application;

import javafx.application.Application;
import javafx.stage.Stage;
import application.mainmenu.MainMenuController;
import application.mainmenu.MainMenuModel;
import application.mainmenu.MainMenuView;

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

    public static Stage getPrimaryStage() {
        return primaryStage;
    }
}
