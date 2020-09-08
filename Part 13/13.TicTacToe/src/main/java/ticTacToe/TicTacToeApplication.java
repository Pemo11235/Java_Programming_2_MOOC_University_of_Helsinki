package ticTacToe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
//import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        Label instructions = new Label();
        instructions.setFont(Font.font("Monospaced", 40));
        GameGrid gameList = new GameGrid();

        GridPane gameGrid = new GridPane();

        TurnLogic turn = new TurnLogic(instructions, gameList);

        gameGrid.setVgap(10);
        gameGrid.setHgap(10);
        gameGrid.setPadding(new Insets(20, 20, 20, 20));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ButtonTris btnT = new ButtonTris(i, j, turn);
                //btnT.setFont(Font.font("Monospaced", 40));                
                gameGrid.add(btnT.getBtn(), i, j);
                gameList.add(btnT,i,j);
            }
        }

        instructions.setText("Turn: " + turn.getTurn());


        layout.setTop(instructions);
        layout.setCenter(gameGrid);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();

    }

}
