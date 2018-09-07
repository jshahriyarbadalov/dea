package az.dea.controllers.sell;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SellDoneController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private AnchorPane hesab;

    private void print (Node node){
        PrinterJob job = PrinterJob.createPrinterJob();
        if(job != null){
            boolean printed = job.printPage(node);
            if(printed){
                job.endJob();
            }
        }
    }
    @FXML
    public void printHesab(){
        print(hesab);
    }

    @FXML
    public void donePay(){
        hesab.getScene().getWindow().hide();
    }

    @FXML
    public void addSellCostumer() throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("/fxml/addSellCustomer.fxml"));
        Stage st = new Stage();
        st.setTitle("DEA Restautant");
        st.setScene(new Scene(pane, 800, 610));
        st.show();
    }
}
