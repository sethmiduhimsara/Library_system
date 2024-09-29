package lk.codepro.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class registerformcontroller {
    public AnchorPane regancharpane1;

    public void btnsignupOnAction(ActionEvent actionEvent) {
        Stage window = (Stage) regancharpane1.getScene().getWindow();
        window.close();

        Stage Stage = new Stage();
        try {
            Parent load = FXMLLoader.load(getClass().getResource("/view/login_form.fxml"));
            Scene scene=new Scene(load);
            Stage.setScene(scene);
            Stage.show();

        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR,"faild to load the form-contact developer");
            e.printStackTrace();
        }
    }
}
