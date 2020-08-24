package application.mainmenu;

import application.mainmenu.newscene.FirstLevelSceneController;
import application.mainmenu.newscene.FirstLevelSceneModel;
import application.mainmenu.newscene.FirstLevelSceneView;
import application.mainmenu.newstage.FirstLevelStageController;
import application.mainmenu.newstage.FirstLevelStageModel;
import application.mainmenu.newstage.FirstLevelStageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuController implements EventHandler<ActionEvent> {

    private Stage primaryStage;
    private MainMenuView theView;
    private MainMenuModel theModel;

    public MainMenuController(MainMenuView theView, MainMenuModel theModel, Stage primaryStage) {

        this.primaryStage = primaryStage;
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {

        Object evt = event.getSource();

        if (evt == theView.getNewSceneButton()) {
            primaryStage.setScene(new FirstLevelSceneController(new FirstLevelSceneView(), new FirstLevelSceneModel(), primaryStage).getScene());
        }
        else if (evt == theView.getNewStageButton()) {
            new FirstLevelStageController(new FirstLevelStageView(), new FirstLevelStageModel(), primaryStage);
        }
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
