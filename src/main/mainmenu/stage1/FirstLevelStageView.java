package main.mainmenu.stage1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

class FirstLevelStageView {

    private Stage stage;
    private Button newSceneButton;
    private Button newStageButton;
    private Button mainMenuButton;

    FirstLevelStageView() {

        stage = new Stage();
        stage.setTitle("Stage lvl 1");

        GridPane mainPane = new GridPane();
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setPadding(new Insets(50));
        mainPane.setVgap(25);
        mainPane.setHgap(25);

        Text menuNameText = new Text("Stage lvl 1");
        menuNameText.setFont(new Font("Default", 25));
        GridPane.setHalignment(menuNameText, HPos.CENTER);
        mainPane.add(menuNameText, 0, 0);

        newSceneButton = new Button("New Scene");
        GridPane.setHalignment(newSceneButton, HPos.CENTER);
        mainPane.add(newSceneButton, 0, 1);

        newStageButton = new Button("New Stage");
        GridPane.setHalignment(newStageButton, HPos.CENTER);
        mainPane.add(newStageButton, 0, 2);

        mainMenuButton = new Button("Close Stage");
        GridPane.setHalignment(mainMenuButton, HPos.CENTER);
        mainPane.add(mainMenuButton, 0, 3);

        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.show();
    }

    void addListeners(EventHandler<ActionEvent> listener) {

        newSceneButton.setOnAction(listener);
        newStageButton.setOnAction(listener);
        mainMenuButton.setOnAction(listener);
    }

    void closeStage() {
        stage.close();
    }

    void setScene(Scene newScene) {
        stage.setScene(newScene);
    }

    Button getNewSceneButton() {
        return newSceneButton;
    }

    Button getNewStageButton() {
        return newStageButton;
    }

    Button getMainMenuButton() {
        return mainMenuButton;
    }
}
