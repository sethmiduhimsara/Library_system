package lk.codepro.controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class loginformcontroller {
    public AnchorPane mainanchorpane;
    public AnchorPane subanchorpane1;
    public AnchorPane subanchorpane2;
    public TextField txtusername;
    public TextField txtpassword;
    public PasswordField pwdpasswordfield;

    public void btnloginOnAction(ActionEvent actionEvent) {
        Stage window = (Stage) txtpassword.getScene().getWindow();
        window.close();

        Stage Stage =new Stage();
        try {
            Parent load = FXMLLoader.load(getClass().getResource("/view/dashboard_form.fxml"));
            Scene scene = new Scene(load);
            Stage.setScene(scene);
            Stage.show();
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"error load dashboard-contact developer");
            e.printStackTrace();
        }


    }

    public void btncreateaccountOnAction(ActionEvent actionEvent) {
        subanchorpane2.getChildren().clear();


        try {
            Parent load = FXMLLoader.load(getClass().getResource("/view/register_form_.fxml"));
            ObservableList<Node> children = subanchorpane2.getChildren();
            children.add(load);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"faild to load the form-contact developer");
            e.printStackTrace();
        }

    }

    public void btnviewandhideOnAction(ActionEvent actionEvent) {
    }
}
