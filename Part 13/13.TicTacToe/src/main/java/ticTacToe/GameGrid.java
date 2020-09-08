package ticTacToe;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author matte
 */
public class GameGrid {

    private ArrayList<ButtonTris> gameGrid;

    public GameGrid() {
        this.gameGrid = new ArrayList<>();
    }

    public void add(ButtonTris btnT, int col, int row) {
        this.gameGrid.add(btnT);
        btnT.setCol(col);
        btnT.setRow(row);
    }

    public Boolean checkWin() {
        if (winDiag()) {
            return true;
            
        }

      //  if (winHor()) {
        //    return true;
       // }

      //  if (winVer()) {
       //     return true;
       // }
        printAll();
        return false;
    }

    public Boolean areAllUsed() {
        for (ButtonTris btn : gameGrid) {
            if (!btn.isUsed()) {
                return false;
            }
        }
        return true;
    }

    public ButtonTris searchByCord(int cord) {
        for (ButtonTris btn : gameGrid) {
            if (btn.getCord() == cord) {

                return btn;
            }
        }
        return null;
    }

    public Boolean winDiag() {
        if (searchByCord(0).isUsed()) {
            if (searchByCord(11).isUsed()
                    && searchByCord(22).isUsed()) {
                if ((searchByCord(0).getText().equals("X"))
                        && (searchByCord(22).getText().equals("X"))
                        && (searchByCord(11).getText().equals("X"))) {
                   
                    return true;
                }
            }
        }

        if (searchByCord(20).isUsed()) {
            if (searchByCord(11).isUsed()
                    && searchByCord(2).isUsed()) {
                if ((searchByCord(20).getText().equals(searchByCord(2).getText()))
                        && (searchByCord(2).getText().equals(searchByCord(11).getText()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean winHor() {
        if (searchByCord(20).isUsed()) {
            if (searchByCord(10).isUsed()
                    && searchByCord(0).isUsed()) {
                if ((searchByCord(20).getText().equals(searchByCord(10).getText()))
                        && (searchByCord(20).getText().equals(searchByCord(0).getText()))) {
                    return true;
                }
            }
        }

        if (searchByCord(21).isUsed()) {
            if (searchByCord(11).isUsed()
                    && searchByCord(1).isUsed()) {
                if ((searchByCord(21).getText().equals(searchByCord(11).getText()))
                        && (searchByCord(21).getText().equals(searchByCord(1).getText()))) {
                    return true;
                }
            }
        }

        if (searchByCord(22).isUsed()) {
            if (searchByCord(12).isUsed()
                    && searchByCord(2).isUsed()) {
                if ((searchByCord(22).getText().equals(searchByCord(12).getText()))
                        && (searchByCord(22).getText().equals(searchByCord(2).getText()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean winVer() {
        if (searchByCord(0).isUsed()) {
            if (searchByCord(1).isUsed()
                    && searchByCord(2).isUsed()) {
                if ((searchByCord(0).getText().equals(searchByCord(1).getText()))
                        && (searchByCord(0).getText().equals(searchByCord(2).getText()))) {
                    return true;
                }
            }
        }

        if (searchByCord(10).isUsed()) {
            if (searchByCord(11).isUsed()
                    && searchByCord(12).isUsed()) {
                if ((searchByCord(10).getText().equals(searchByCord(11).getText()))
                        && (searchByCord(10).getText().equals(searchByCord(12).getText()))) {
                    return true;
                }
            }
        }

        if (searchByCord(20).isUsed()) {
            if (searchByCord(21).isUsed()
                    && searchByCord(22).isUsed()) {
                if ((searchByCord(20).getText().equals(searchByCord(21).getText()))
                        && (searchByCord(20).getText().equals(searchByCord(22).getText()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void printAll() {
        for (ButtonTris btn : gameGrid) {
            System.out.println(btn);
        }
    }

}
