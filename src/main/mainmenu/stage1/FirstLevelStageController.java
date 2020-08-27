package main.mainmenu.stage1;

//import main.mainmenu.stage1.scene2.SecondLevelSceneController;
//import main.mainmenu.stage1.stage2.SecondLevelStageController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class FirstLevelStageController implements EventHandler<ActionEvent> {

    private FirstLevelStageView theView;
    private FirstLevelStageModel theModel;

    public FirstLevelStageController() {

        this.theView = new FirstLevelStageView();
        this.theModel = new FirstLevelStageModel();

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {

        Object evt = event.getSource();

//        if (evt == theView.getNewSceneButton()) {
//            this.setScene(new SecondLevelSceneController().getScene());
//        }
//        else if (evt == theView.getNewStageButton()) {
//            new SecondLevelStageController();
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
