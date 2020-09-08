package smiley;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application{


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Canvas paintingCanvas = new Canvas(480,480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        paintingLayout.setPadding(new Insets(10,10,10,10));
        
        
        painter.setFill(Color.BLACK);
        painter.fillRect(120, 120, 50, 50);
        painter.fillRect(320, 120, 50, 50);
        painter.fillRect(120, 360, 250, 50);
        painter.fillRect(70, 310, 50, 50);
        painter.fillRect(370, 310, 50, 50);
        
        
        Scene view = new Scene(paintingLayout);
        
        stage.setScene(view);
        stage.show();
    }

}
