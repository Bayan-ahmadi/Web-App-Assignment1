package com.ahmadiba.assignment1.domain;

import java.io.Serializable;

public class Result implements Serializable {

    public int choice;
    public int comChoice ;


    public Result(){

    }

    public int getComChoice() {

        comChoice = (int)(Math.random() * 3);
        System.out.println( "rock = 0 \n");
        System.out.println( "paper = 1 \n");
        System.out.println( "sizzors = 2 \n");

        System.out.println( "Computer choose" + comChoice);

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

        if(comChoice == choice)
            return  "You tied";


        // rock = 0
        // paper = 1
        // sizzors = 2

        if (( choice == 0 && comChoice == 2) || ( choice == 2 && comChoice == 1) || ( choice == 1 && comChoice ==0)){
           return  "You Win!";

        }

        return  "You lose!" ;
    }


    }



