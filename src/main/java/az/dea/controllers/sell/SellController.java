package az.dea.controllers.sell;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SellController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private AnchorPane mainPane;
    @FXML
    public void addPay() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sellDone.fxml"));
        Stage stage = new Stage();
        stage.setTitle("DEA Restautant");
        stage.setScene(new Scene(root, 1000, 610));
        stage.show();
    }

    @FXML
    public void goSellHistory() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/sellHistory.fxml"));
        mainPane.getChildren().clear();
        mainPane.getChildren().add(pane);
    }
    @FXML
    public void addSellCostumer() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/addSellCustomer.fxml"));
        Stage stage = new Stage();
        stage.setTitle("DEA Restautant");
        stage.setScene(new Scene(root, 800, 610));
        stage.show();
    }
}
