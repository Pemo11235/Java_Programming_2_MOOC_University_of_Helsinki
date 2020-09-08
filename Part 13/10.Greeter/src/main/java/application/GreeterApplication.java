package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        // 1. 
        // 1.1 Component and layout
        GridPane layout = new GridPane();
        Label instruction = new Label("Enter your name and start.");
        TextField textIn = new TextField();
        Button start = new Button("Start");
        
        //1.2 Set and style layout
        layout.add(instruction, 0, 0);
        layout.add(textIn, 0, 1);
        layout.add(start, 0, 2);
        
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20,20,20,20));
        
        Scene firstView = new Scene(layout);
        
        // 2
        Label welcome = new Label("");
        
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcome);
        welcomeLayout.setAlignment(Pos.CENTER);
        
        Scene secondView = new Scene(welcomeLayout);
        
        //3 Logic
        start.setOnAction((event)->{
            welcome.setText("Welcome "+textIn.getText()+"!");
            window.setScene(secondView);
        });
        
        // 4 End
        window.setScene(firstView);
        window.show();
    }
}
