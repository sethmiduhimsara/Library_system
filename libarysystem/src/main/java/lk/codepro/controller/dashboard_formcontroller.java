package lk.codepro.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class dashboard_formcontroller {
    public AnchorPane mainframepane;

    public void btnmanageAuthorsandPublishersOnAction(ActionEvent actionEvent) {
        mainframepane.getChildren().clear();

        try {
            Parent load = FXMLLoader.load(getClass().getResource("/view/sub/manage_author_publisher_form.fxml"));
            mainframepane.getChildren().add(load);


        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"Ui load error- contact developer").show();
            e.printStackTrace();
        }
    }

    public void btnmanagememberOnAction(ActionEvent actionEvent) {
        mainframepane.getChildren().clear();

        try {
            Parent load = FXMLLoader.load(getClass().getResource("/view/sub/manage_member_form.fxml"));
            mainframepane.getChildren().add(load);


        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"Ui load error- contact developer").show();
            e.printStackTrace();
        }
    }

    public void btnmanagebookOnAction(ActionEvent actionEvent) {

        mainframepane.getChildren().clear();

        try {
            Parent load = FXMLLoader.load(getClass().getResource("/view/sub/manage_book_form.fxml"));
            mainframepane.getChildren().add(load);


        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"Ui load error- contact developer").show();
            e.printStackTrace();
        }

    }

    public void btnborrowbookOnAction(ActionEvent actionEvent) {
        mainframepane.getChildren().clear();

        try {
            Parent load = FXMLLoader.load(getClass().getResource("/view/sub/borrow_book_and_return_form.fxml"));
            mainframepane.getChildren().add(load);


        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"Ui load error- contact developer").show();
            e.printStackTrace();
        }
    }

    public void btnReturnbookOnAction(ActionEvent actionEvent) {

        mainframepane.getChildren().clear();

        try {
            Parent load = FXMLLoader.load(getClass().getResource("/view/sub/return_book_form.fxml"));
            mainframepane.getChildren().add(load);


        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"Ui load error- contact developer").show();
            e.printStackTrace();
        }
    }
}
