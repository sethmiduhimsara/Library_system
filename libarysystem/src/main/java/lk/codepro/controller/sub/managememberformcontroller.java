package lk.codepro.controller.sub;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lk.codepro.dto.member_dto;
import lk.codepro.service.member_service;

public class managememberformcontroller {
    public TextField txtmemberid;
    public TextField txtmembername;
    public TextField txtmemberadress;
    public TextField txtmemberemail;
    public TextField txtmembercontact;
    public TableView tblmember;
    public TableColumn colmemberid;
    public TableColumn colmembername;
    public TableColumn colmemberadress;
    public TableColumn colmemberemail;
    public TableColumn colmembercontact;


    private final member_service service = new member_service();

    public void txtmemberidsearchOnAction(ActionEvent actionEvent) {
    }

    public void txtmemberemailOnAction(ActionEvent actionEvent) {
    }

    public void txtmemberecontactOnAction(ActionEvent actionEvent) {
    }

    public void btnsaveOnAction(ActionEvent actionEvent) {

        member_dto memberDto = collectData();
        boolean ismembersave = service.addMember(memberDto);
        if(ismembersave){
            new Alert(Alert.AlertType.INFORMATION,"member save successful").show();

        } else {
            new Alert(Alert.AlertType.INFORMATION,"member save failed").show();
        }


    }


    public void btnupdateOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {

        String memberid = txtmemberid.getText();
        boolean delete = service.delete(memberid);

        if(delete){
            new Alert(Alert.AlertType.INFORMATION,"member delete successful").show();
        }else {
            new Alert(Alert.AlertType.INFORMATION,"member delete failed").show();
        }
    }

    public void btnclearOnAction(ActionEvent actionEvent) {

    }

    public member_dto collectData(){
        String id = txtmemberid.getText();
        String name = txtmembername.getText();
        String address = txtmemberadress.getText();
        String email = txtmemberemail.getText();
        String contact = txtmembercontact.getText();


        member_dto memberDto = new member_dto(id, name, address, email, contact);

        return memberDto;
    }
}
