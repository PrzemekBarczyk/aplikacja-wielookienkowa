package main.mainmenu;

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

public class MainMenuView {

    private Scene scene;
    private Button newSceneButton;
    private Button newStageButton;

    public MainMenuView() {

        GridPane mainPane = new GridPane();
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setPadding(new Insets(50));
        mainPane.setVgap(25);
        mainPane.setHgap(25);

        Text menuNameText = new Text("Main Menu");
        menuNameText.setFont(new Font("Default", 25));
        GridPane.setHalignment(menuNameText, HPos.CENTER);
        mainPane.add(menuNameText, 0, 0, 2, 1);

        newSceneButton = new Button("New Scene");
        GridPane.setHalignment(newSceneButton, HPos.CENTER);
        mainPane.add(newSceneButton, 0, 1);

        newStageButton = new Button("New Stage");
        GridPane.setHalignment(newStageButton, HPos.CENTER);
        mainPane.add(newStageButton, 1, 1);

        scene = new Scene(mainPane);
    }

    protected void addListeners(EventHandler<ActionEvent> listener) {

        newSceneButton.setOnAction(listener);
        newStageButton.setOnAction(listener);
    }

    protected Scene getScene() {
        return scene;
    }

    protected Button getNewSceneButton() {
        return newSceneButton;
    }

    protected Button getNewStageButton() {
        return newStageButton;
    }
}
