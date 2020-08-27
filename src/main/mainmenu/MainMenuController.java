package main.mainmenu;

import main.Main;
import main.mainmenu.scene1.FirstLevelSceneController;
import main.mainmenu.stage1.FirstLevelStageController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class MainMenuController implements EventHandler<ActionEvent> {

    private MainMenuView theView;
    private MainMenuModel theModel;

    public MainMenuController() {

        this.theView = new MainMenuView();
        this.theModel = new MainMenuModel();

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {

        Object evt = event.getSource();

        if (evt == theView.getNewSceneButton()) {
            Main.setScene(new FirstLevelSceneController().getScene());
        }
        else if (evt == theView.getNewStageButton()) {
            new FirstLevelStageController();
        }
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
