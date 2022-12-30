package de.udemy.task3;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;


//init
//start
//stop

/**
 * Dies ist dafür gedacht den lebenszyklus abzubilden mit init und stop methoden
 */


public class HelloApplication extends Application {


    @Override
    public void init() throws Exception {
        System.out.println("INIT");
    }

    @Override
    public void start(Stage stage) throws IOException {
        System.out.println("START");

        BorderPane root = new BorderPane();
        Button button = new Button("EXIT");

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Platform.exit();
            }
        });

        Scene scene = new Scene(root, 400, 400);

        root.setCenter(button);

        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        System.out.println("STOP");
    }

    public static void main(String[] args) {
        launch();
    }
}