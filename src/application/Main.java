package application;

import javafx.application.Application;
import javafx.stage.Stage;
import application.mainmenu.MainMenuController;
import application.mainmenu.MainMenuModel;
import application.mainmenu.MainMenuView;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

        primaryStage.setTitle("Aplikacja wielookienkowa");
        primaryStage.setScene(new MainMenuController(new MainMenuView(), new MainMenuModel(), primaryStage).getScene());
        primaryStage.show();
    }
}
