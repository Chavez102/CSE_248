package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Introduction_Controller {

    @FXML
    private Button Im_Ready_btn;

    @FXML
    void Im_Ready_btn_Pressed(ActionEvent event) {
    	application.Main.SwitchPageto(event, "Introduction_Page.fxml");

    }
}
