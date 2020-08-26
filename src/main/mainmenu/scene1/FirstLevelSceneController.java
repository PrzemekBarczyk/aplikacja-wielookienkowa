package main.mainmenu.scene1;

import main.Main;
import main.mainmenu.MainMenuController;
import main.mainmenu.MainMenuModel;
import main.mainmenu.MainMenuView;
//import application.mainmenu.newscene.newerscene.SecondLevelSceneController;
//import application.mainmenu.newscene.newerscene.SecondLevelSceneModel;
//import application.mainmenu.newscene.newerscene.SecondLevelSceneView;
//import application.mainmenu.newscene.newerstage.SecondLevelStageController;
//import application.mainmenu.newscene.newerstage.SecondLevelStageModel;
//import application.mainmenu.newscene.newerstage.SecondLevelStageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class FirstLevelSceneController implements EventHandler<ActionEvent> {

    private FirstLevelSceneView theView;
    private FirstLevelSceneModel theModel;

    public FirstLevelSceneController(FirstLevelSceneView theView, FirstLevelSceneModel theModel) {

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {

        Object evt = event.getSource();

//        if (evt == theView.getNewSceneButton()) {
//            Main.setScene(new SecondLevelSceneController(new SecondLevelSceneView(), new SecondLevelSceneModel()).getScene());
//        }
//        else if (evt == theView.getNewStageButton()) {
//            new SecondLevelStageController(new SecondLevelStageView(), new SecondLevelStageModel());
//        }
        if (evt == theView.getMainMenuButton()) {
            Main.setScene(new MainMenuController(new MainMenuView(), new MainMenuModel()).getScene());
        }
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
