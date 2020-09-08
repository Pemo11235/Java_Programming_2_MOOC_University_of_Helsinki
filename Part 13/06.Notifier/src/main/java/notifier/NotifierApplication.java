package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        TextField topText = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        button.setOnAction((event)->{
            label.setText(topText.getText());
        });
        
        VBox componentGroup = new VBox();
        componentGroup.setSpacing(10);
        componentGroup.getChildren().addAll(topText,button,label);
        
        Scene scene = new Scene(componentGroup);
        
        window.setScene(scene);
        window.setTitle("Notifier");
        window.show();
    }

}
