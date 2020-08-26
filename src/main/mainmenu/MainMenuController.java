package main.mainmenu;

import main.Main;
import main.mainmenu.scene1.FirstLevelSceneController;
import main.mainmenu.scene1.FirstLevelSceneModel;
import main.mainmenu.scene1.FirstLevelSceneView;
import main.mainmenu.stage1.FirstLevelStageController;
import main.mainmenu.stage1.FirstLevelStageModel;
import main.mainmenu.stage1.FirstLevelStageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class MainMenuController implements EventHandler<ActionEvent> {

    private MainMenuView theView;
    private MainMenuModel theModel;

    public MainMenuController(MainMenuView theView, MainMenuModel theModel) {

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {

        Object evt = event.getSource();

        if (evt == theView.getNewSceneButton()) {
            Main.setScene(new FirstLevelSceneController(new FirstLevelSceneView(), new FirstLevelSceneModel()).getScene());
        }
        else if (evt == theView.getNewStageButton()) {
            new FirstLevelStageController(new FirstLevelStageView(), new FirstLevelStageModel());
        }
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
