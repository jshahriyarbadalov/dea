package az.dea.controllers.home;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private AnchorPane mainPane;
    @FXML
    public void goMainMenu() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        mainPane.getChildren().clear();
        mainPane.getChildren().add(pane);
    }

    @FXML
    public void goSellMenu() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/sell.fxml"));
        mainPane.getChildren().clear();
        mainPane.getChildren().add(pane);
    }
    @FXML
    public void goProductMenu() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/product.fxml"));
        mainPane.getChildren().clear();
        mainPane.getChildren().add(pane);
    }
    @FXML
    public void goCustomerMenu() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/customer.fxml"));
        mainPane.getChildren().clear();
        mainPane.getChildren().add(pane);
    }


}
