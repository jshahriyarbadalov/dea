package az.dea.controllers.user;

import az.dea.beans.User;
import az.dea.db.UserRepository;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class UserController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    private final UserRepository userRepository;
    {
        userRepository = new UserRepository();
    }

    @FXML
    public void addUser(){
        User user = new User();

        try {
            userRepository.save(user);
        }catch (Exception e){
            e.printStackTrace(System.err);
        }
    }
}
