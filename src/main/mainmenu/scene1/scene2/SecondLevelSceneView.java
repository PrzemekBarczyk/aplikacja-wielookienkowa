package main.mainmenu.scene1.scene2;

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

class SecondLevelSceneView {

    private Scene scene;
    private Button mainMenuButton;

    SecondLevelSceneView() {

        GridPane mainPane = new GridPane();
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setPadding(new Insets(50));
        mainPane.setVgap(25);
        mainPane.setHgap(25);

        Text menuNameText = new Text("Scene lvl 2");
        menuNameText.setFont(new Font("Default", 25));
        GridPane.setHalignment(menuNameText, HPos.CENTER);
        mainPane.add(menuNameText, 0, 0);

        mainMenuButton = new Button("Main Menu");
        GridPane.setHalignment(mainMenuButton, HPos.CENTER);
        mainPane.add(mainMenuButton, 0, 1);

        scene = new Scene(mainPane);
    }

    void addListeners(EventHandler<ActionEvent> listener) {
        mainMenuButton.setOnAction(listener);
    }

    Scene getScene() {
        return scene;
    }

    Button getMainMenuButton() {
        return mainMenuButton;
    }
}

