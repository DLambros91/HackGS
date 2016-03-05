/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author dlambros
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        CSVReader temp = new CSVReader();
        temp.read();
        String[][] EandT = temp.EmailAndTag;
        User U = new User("Harsh Shah", EandT);
        U.addTag("tag1", 1);
        U.addTag("tag2", 2);
        U.addTag("tag3", 3);
        U.addTag("tag4", 4);
        U.addTag("tag5", 5);
        U.addTag("tag6", 6);
        U.addTag("tag7", 7);
        U.addTag("tag8", 8);
        U.addTag("tag9", 9);
        U.addTag("tag10", 10);
        Analytics A = new Analytics(U);
        String[][] result = A.EmailPriorities();
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
