package main.mainmenu.scene1;

import main.Main;
import main.mainmenu.MainMenuController;
//import main.mainmenu.scene1.scene2.SecondLevelSceneController;
//import main.mainmenu.scene1.stage2.SecondLevelStageController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class FirstLevelSceneController implements EventHandler<ActionEvent> {

    private FirstLevelSceneView theView;
    private FirstLevelSceneModel theModel;

    public FirstLevelSceneController() {

        this.theView = new FirstLevelSceneView();
        this.theModel = new FirstLevelSceneModel();

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {

        Object evt = event.getSource();

//        if (evt == theView.getNewSceneButton()) {
//            Main.setScene(new SecondLevelSceneController().getScene());
//        }
//        else if (evt == theView.getNewStageButton()) {
//            new SecondLevelStageController();
//        }
        if (evt == theView.getMainMenuButton()) {
            Main.setScene(new MainMenuController().getScene());
        }
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
