package application.mainmenu.newstage;

//import application.mainmenu.newstage.newerscene.SecondLevelSceneController;
//import application.mainmenu.newstage.newerscene.SecondLevelSceneModel;
//import application.mainmenu.newstage.newerscene.SecondLevelSceneView;
//import application.mainmenu.newstage.newerstage.SecondLevelStageController;
//import application.mainmenu.newstage.newerstage.SecondLevelStageModel;
//import application.mainmenu.newstage.newerstage.SecondLevelStageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class FirstLevelStageController implements EventHandler<ActionEvent> {

    private Stage primaryStage;
    private FirstLevelStageView theView;
    private FirstLevelStageModel theModel;

    public FirstLevelStageController(FirstLevelStageView theView, FirstLevelStageModel theModel, Stage primaryStage) {

        this.primaryStage = primaryStage;
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {

        Object evt = event.getSource();

//        if (evt == theView.getNewSceneButton()) {
//            theView.setScene(new SecondLevelSceneController(new SecondLevelSceneView(), new SecondLevelSceneModel(), primaryStage).getScene());
//        }
//        else if (evt == theView.getNewStageButton()) {
//            new SecondLevelStageController(new SecondLevelStageView(), new SecondLevelStageModel(), primaryStage);
//        }
        if (evt == theView.getMainMenuButton()) {
            theView.closeStage();
        }
    }
}
