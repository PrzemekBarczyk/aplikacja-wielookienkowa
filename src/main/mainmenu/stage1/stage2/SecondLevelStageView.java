package main.mainmenu.stage1.stage2;

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

class SecondLevelStageView {

    private Stage stage;
    private Button mainMenuButton;

    SecondLevelStageView() {

        stage = new Stage();

        GridPane mainPane = new GridPane();
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setPadding(new Insets(50));
        mainPane.setVgap(25);
        mainPane.setHgap(25);

        Text menuNameText = new Text("Stage lvl 2");
        menuNameText.setFont(new Font("Default", 25));
        GridPane.setHalignment(menuNameText, HPos.CENTER);
        mainPane.add(menuNameText, 0, 0);

        mainMenuButton = new Button("Main Menu");
        GridPane.setHalignment(mainMenuButton, HPos.CENTER);
        mainPane.add(mainMenuButton, 0, 1);

        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.show();
    }

    void addListeners(EventHandler<ActionEvent> listener) {
        mainMenuButton.setOnAction(listener);
    }

    void closeStage() {
        stage.close();
    }

    Stage getStage() {
        return stage;
    }

    Button getMainMenuButton() {
        return mainMenuButton;
    }
}

