package textstatistics;

import java.util.Arrays;
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
        Label letters = new Label("Letters: ");
        Label words = new Label("Words: ");
        Label longest = new Label("The longest word is: ");
        TextArea text = new TextArea();
        //Bottom
        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(letters);
        buttons.getChildren().add(words);
        buttons.getChildren().add(longest);
       //Center
        layout.setCenter(text);
        layout.setBottom(buttons);
        
        text.textProperty().addListener((change, oldValue, newValue)->{
            int chars = newValue.length();
            String[] parts = newValue.split(" ");
            int numWords = parts.length;
            String longestWord = Arrays.stream(parts)
                    .sorted((s1,s2)->s2.length()-s1.length())
                    .findFirst()
                    .get();
            
            letters.setText("Letters: " + chars);
            words.setText("Words: "+ numWords);
            longest.setText("The longest word is: " + longestWord);
            
        });
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }

}
