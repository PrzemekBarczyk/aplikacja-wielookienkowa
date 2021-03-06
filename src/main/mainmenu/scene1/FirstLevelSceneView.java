package main.mainmenu.scene1;

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

class FirstLevelSceneView {

    private Scene scene;
    private Button newSceneButton;
    private Button newStageButton;
    private Button mainMenuButton;

    FirstLevelSceneView() {

        GridPane mainPane = new GridPane();
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setPadding(new Insets(50));
        mainPane.setVgap(25);
        mainPane.setHgap(25);

        Text menuNameText = new Text("Scene lvl 1");
        menuNameText.setFont(new Font("Default", 25));
        GridPane.setHalignment(menuNameText, HPos.CENTER);
        mainPane.add(menuNameText, 0, 0);

        newSceneButton = new Button("New Scene");
        GridPane.setHalignment(newSceneButton, HPos.CENTER);
        mainPane.add(newSceneButton, 0, 1);

        newStageButton = new Button("New Stage");
        GridPane.setHalignment(newStageButton, HPos.CENTER);
        mainPane.add(newStageButton, 0, 2);

        mainMenuButton = new Button("Main Menu");
        GridPane.setHalignment(mainMenuButton, HPos.CENTER);
        mainPane.add(mainMenuButton, 0, 3);

        scene = new Scene(mainPane);
    }

    void addListeners(EventHandler<ActionEvent> listener) {

        newSceneButton.setOnAction(listener);
        newStageButton.setOnAction(listener);
        mainMenuButton.setOnAction(listener);
    }

    Scene getScene() {
        return scene;
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
