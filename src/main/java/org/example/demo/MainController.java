package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class MainController {
    private Stage stage;
    private Scene scene;
    private Parent root;

//    public void onClickPatientButton(ActionEvent event) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("patient.fxml"));
//        Parent patientRoot = fxmlLoader.load();
//
//        Scene patientScene = new Scene(patientRoot);
//
//        stage.setScene(patientScene);
//        stage.show();
//    }
//
//    public void onClickDoctorButton(ActionEvent event) throws IOException {
//
//    }
//
//    public void onClickAdminButton(ActionEvent event) throws IOException {
//
//    }

    @FXML
    public Button buttonPatient;
    @FXML
    public Button buttonDoctor;
    @FXML
    public Button buttonAdmin;
    @FXML
    public AnchorPane contentPane;

    public void loadContent(String fxml) throws IOException {
        AnchorPane newContent = FXMLLoader.load(getClass().getResource(fxml));
        contentPane.getChildren().clear();
        contentPane.getChildren().add(newContent);
    }
}
