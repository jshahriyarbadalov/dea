package az.dea.controllers.sell;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class AddSellCustomerController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private Label label;

    @FXML
    public void done(){
        label.getScene().getWindow().hide();
    }
}
