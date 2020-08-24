package application.mainmenu.newscene;

import application.mainmenu.MainMenuController;
import application.mainmenu.MainMenuModel;
import application.mainmenu.MainMenuView;
//import application.mainmenu.newscene.newerscene.SecondLevelSceneController;
//import application.mainmenu.newscene.newerscene.SecondLevelSceneModel;
//import application.mainmenu.newscene.newerscene.SecondLevelSceneView;
//import application.mainmenu.newscene.newerstage.SecondLevelStageController;
//import application.mainmenu.newscene.newerstage.SecondLevelStageModel;
//import application.mainmenu.newscene.newerstage.SecondLevelStageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FirstLevelSceneController implements EventHandler<ActionEvent> {

    private Stage primaryStage;
    private FirstLevelSceneView theView;
    private FirstLevelSceneModel theModel;

    public FirstLevelSceneController(FirstLevelSceneView theView, FirstLevelSceneModel theModel, Stage primaryStage) {

        this.primaryStage = primaryStage;
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {

        Object evt = event.getSource();

//        if (evt == theView.getNewSceneButton()) {
//            primaryStage.setScene(new SecondLevelSceneController(new SecondLevelSceneView(), new SecondLevelSceneModel(), primaryStage).getScene());
//        }
//        else if (evt == theView.getNewStageButton()) {
//            new SecondLevelStageController(new SecondLevelStageView(), new SecondLevelStageModel(), primaryStage);
//        }
        if (evt == theView.getMainMenuButton()) {
            primaryStage.setScene(new MainMenuController(new MainMenuView(), new MainMenuModel(), primaryStage).getScene());
        }
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
