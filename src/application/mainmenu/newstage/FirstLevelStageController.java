package application.mainmenu.newstage;

//import application.mainmenu.newstage.newerscene.SecondLevelSceneController;
//import application.mainmenu.newstage.newerscene.SecondLevelSceneModel;
//import application.mainmenu.newstage.newerscene.SecondLevelSceneView;
//import application.mainmenu.newstage.newerstage.SecondLevelStageController;
//import application.mainmenu.newstage.newerstage.SecondLevelStageModel;
//import application.mainmenu.newstage.newerstage.SecondLevelStageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class FirstLevelStageController implements EventHandler<ActionEvent> {

    private FirstLevelStageView theView;
    private FirstLevelStageModel theModel;

    public FirstLevelStageController(FirstLevelStageView theView, FirstLevelStageModel theModel) {

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {

        Object evt = event.getSource();

//        if (evt == theView.getNewSceneButton()) {
//            this.setScene(new SecondLevelSceneController(new SecondLevelSceneView(), new SecondLevelSceneModel()).getScene());
//        }
//        else if (evt == theView.getNewStageButton()) {
//            new SecondLevelStageController(new SecondLevelStageView(), new SecondLevelStageModel());
//        }
        if (evt == theView.getMainMenuButton()) {
            this.closeStage();
        }
    }

    public void closeStage() {
        theView.closeStage();
    }

    public void setScene(Scene newScene) {
        theView.setScene(newScene);
    }
}
