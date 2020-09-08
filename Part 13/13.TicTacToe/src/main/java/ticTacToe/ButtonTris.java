/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;


import javafx.scene.control.Button;
import javafx.scene.text.Font;

/**
 *
 * @author matte
 */
public class ButtonTris extends Button{
    private Button btn;
    private Boolean used;
    private int col;
    private int row;
    private TurnLogic turn;

    public ButtonTris(int col, int row, TurnLogic logic) {
        this.btn = new Button(" ");
        this.btn.setFont(Font.font("Monospaced", 40));
        this.col = col;
        this.row = row;
        this.used = false;
        this.turn = logic;
        this.btn.setOnMouseClicked((event) -> {
            if(this.btn.getText().equals(" ")){
                btn.setText(logic.getTurn());
                this.turn.nextTurn();
                this.used = true;
            }           
        });
       // this.btn.setOnAction(e -> this.btn.setDisable(true));
       //this.btn.setOnAction(e -> this.setBtn(String.valueOf(this.col)+"-"+String.valueOf(this.row)));    
    }

    public Button getBtn() {
        return btn;
    }

    public int getCord(){
        return  Integer.valueOf(String.valueOf(this.col)+String.valueOf(this.row));
        
    }
    public Boolean isUsed() {
        if(this.btn.getText().equals("X") || this.btn.getText().equals("O")){
            return true;
        }
        return false;
    }

    public void setBtn(String btn) {
        this.btn.setText(btn);
        this.used = true;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }
    

    @Override
    public String toString() {
        return this.btn.getText() +","+this.col+","+this.row+","+this.getCord()+","+this.isUsed();
    }
   

}
