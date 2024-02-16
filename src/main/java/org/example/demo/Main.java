package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // 加载FXML文件
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = loader.load();
        MainController controller = loader.getController();

        // 设置按钮点击事件处理程序
        controller.buttonPatient.setOnAction(event -> {
            try {
                controller.loadContent("patientView.fxml");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        controller.buttonDoctor.setOnAction(event -> {
            try {
                controller.loadContent("doctorView.fxml");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        controller.buttonAdmin.setOnAction(event -> {
            try {
                controller.loadContent("adminView.fxml");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // 设置场景
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
