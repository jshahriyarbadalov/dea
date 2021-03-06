package az.dea.controllers.sell;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SellHistoryController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private AnchorPane mainPane;
    @FXML
    public void goSellMenu() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/sell.fxml"));
        mainPane.getChildren().clear();
        mainPane.getChildren().add(pane);
    }
}
