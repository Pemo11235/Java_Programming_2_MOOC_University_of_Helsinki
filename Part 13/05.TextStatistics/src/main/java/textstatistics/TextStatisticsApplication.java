package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        //Bottom
        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(new Label("Letters: 0"));
        buttons.getChildren().add(new Label("Words: 0"));
        buttons.getChildren().add(new Label("The longest word is:"));
       //Center
        layout.setCenter(new TextArea(""));
        layout.setBottom(buttons);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }

}
