package com.ahmadiba.assignment1.domain;

import java.io.Serializable;

public class Result implements Serializable {

    public int choice =1;

    public Result(){

    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }



    public void winner(){

        int comChoice = (int)(Math.random()* 3);

        String game = "";



        if(comChoice == choice){

            game = "You tied";
        }

        else if (( choice == 1 && comChoice == 3) || ( choice == 3 && comChoice == 2) || ( choice == 2 && comChoice ==1)){

            game = "You Win!";
        }

        else game = "You Lose";



    }













    }



