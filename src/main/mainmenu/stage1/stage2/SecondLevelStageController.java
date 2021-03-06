package main.mainmenu.stage1.stage2;

import main.Main;
import main.mainmenu.MainMenuController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SecondLevelStageController implements EventHandler<ActionEvent> {

    private SecondLevelStageView theView;
    private SecondLevelStageModel theModel;

    public SecondLevelStageController() {

        this.theView = new SecondLevelStageView();
        this.theModel = new SecondLevelStageModel();

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {

        theView.closeStage();
        Main.setScene(new MainMenuController().getScene());
    }
}

