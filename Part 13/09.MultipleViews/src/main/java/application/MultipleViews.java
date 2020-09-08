package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        // Main Components names
        BorderPane firstPane = new BorderPane();
        VBox secondVB = new VBox();
        GridPane thirdGrid = new GridPane();
        
        //Scenes 
        Scene first = new Scene(firstPane);
        Scene second = new Scene(secondVB);
        Scene third = new Scene(thirdGrid);

        // First component    
        Button firstButton = new Button("To the second view");
        firstPane.setTop(new Label("First view!"));
        firstPane.setCenter(firstButton);
        firstButton.setOnAction((event) -> {
            window.setScene(second);
            window.setTitle("Second");
        });

        // Second component
        Button secondButton = new Button("To the third view!");
        secondVB.getChildren().add(secondButton);
        secondButton.setOnAction((event) -> {
            window.setScene(third);
            window.setTitle("Third");
        });
        secondVB.getChildren().add(new Label("Second view!"));
        
        // Third Component
        thirdGrid.add(new Label("Third view!"), 0, 0);
        Button thirdButton = new Button("To the first view!");
        thirdButton.setOnAction((event)-> {
            window.setScene(first);
            window.setTitle("First");
        });
        thirdGrid.add(thirdButton, 1 ,1);
        
        window.setScene(first);
        window.setTitle("First");
        window.show();
    }

}
