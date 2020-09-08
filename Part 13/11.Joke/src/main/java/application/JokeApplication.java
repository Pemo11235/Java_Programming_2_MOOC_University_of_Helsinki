package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {

        // Layout
        BorderPane layout = new BorderPane();
        // Menu 
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        //  buttons
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button expl = new Button("Explanation");

        // Menu  + buttons
        menu.getChildren().addAll(joke, answer, expl);
        
        layout.setTop(menu);
        
        // Subviews
        StackPane jokeView = createView("What do you call a bear with no teeth?");
        StackPane answerView = createView("A gummy bear.");
        StackPane explView =  createView("Because a gummy bear is not a real bear !");
        
        joke.setOnAction((event) -> layout.setCenter(jokeView) );
        answer.setOnAction((event)-> layout.setCenter(answerView));
        expl.setOnAction((event)-> layout.setCenter(explView));
        
        layout.setCenter(jokeView);
        // Create main scene
        Scene mainView = new Scene(layout);
        
        window.setScene(mainView);
        window.show();
    }
    
    private StackPane createView(String text){
        StackPane layout = new StackPane(); 
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }
}
