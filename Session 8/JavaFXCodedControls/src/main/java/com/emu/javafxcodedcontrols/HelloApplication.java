package com.emu.javafxcodedcontrols;

import com.emu.javafxcodedcontrols.logic.MessageService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        MessageService messageService = new MessageService();
        HelloController helloController = fxmlLoader.getController();
        helloController.setMessageService(messageService);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
//        Label label = new Label("Wenn Chuck Norris ins Wasser fällt wird er nicht nass, sondern das Wasser wird Chuck Norris");
//        label.setVisible(false);
//
//        Button button = new Button("Tell me a joke");
//        button.setPadding(new Insets(25));
//        button.setOnAction(actionEvent -> label.setVisible(true));
//
//        VBox vb = new VBox();
//        vb.setAlignment(Pos.CENTER);
//        vb.getChildren().addAll(label, button);
//
//        Scene scene = new Scene(vb, 300, 200);
//        stage.setScene(scene);
//        stage.setTitle("Chuck Norris joke!");
//        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}