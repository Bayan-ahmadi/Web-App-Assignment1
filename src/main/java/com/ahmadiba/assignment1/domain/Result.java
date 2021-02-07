package com.ahmadiba.assignment1.domain;

import java.io.Serializable;

public class Result implements Serializable {

    public int choice =1;
    public int comChoice =0;


    public Result(){

    }

    public int getComChoice() {
        int comChoice = (int)(Math.random() * 3);
        return comChoice;

    }
    public void setComChoice(int comChoice) {
        this.comChoice = comChoice;
    }



    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }



    public String getWinner(){

        String winner= "";


        if(comChoice == choice){

            winner = "You tied";
        }

        else if (( choice == 0 && comChoice == 2) || ( choice == 2 && comChoice == 1) || ( choice == 1 && comChoice ==0)){

           winner = "You Win!";

        }

        else winner = "You Lose";

        return winner;





    }


    }



