package az.dea.controllers.sell;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


import java.net.URL;
import java.util.ResourceBundle;

public class sellDoneController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private Label print;
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
}
