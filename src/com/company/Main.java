// You will create a simple, 5 question, fill in the blank quiz on a subject of your choice.
// Use the equalsIgnoreCase method to determine if the user provides the correct answer.
// Tell them if they got the answer right or not. At the end of the quiz, tell them how many questions
// that they got right.

// Pseudo code in source
// create an object of type scanner to return a string as the answer
// create strings to hold the 5 questions
// create variable to hold the answer string
// create variable to hold number of correct answers

// display each question in succession
// use an if else statement to parse each answer
// for each correct answer increment the score by 1

// after answers from each question display the number of correct answers

package com.company;

// import for the scanner package
import java.util.Scanner;


public class Main {


    // create an object of type Scanner to manage user input
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Define the question strings

        String question1 = new String("Real first name of Curly on the Three Stooges was ");
        String question2 = new String("Which of the original Stooges also played the Violin ");
        String question3 = new String("Who was the oldest Stooge ");
        String question4 = new String("Who was the youngest Stooge ");
        String question5 = new String("Which Stooge did Ken shake hands with ");

        // Variable to hold the answer String
        String answer = "";
        // Variable to hold the number of correct answers
        int score = 0;


        // code for question 1
        // display the question and get user response
        answer = getInputString(question1);
        // if answer is correct
        if(answer.equalsIgnoreCase("Jerome")){
            System.out.println ("You're Right");

            // increment the score
            score++;
        }
        else
            System.out.println("Sorry, that was the wrong answer");

        // code for question 2
        answer = getInputString(question2);
        if(answer.equalsIgnoreCase("Larry")){
            System.out.println ("You're Right");
            score++;
        }
        else
            System.out.println("Sorry, that was the wrong answer");

        // code for question 3
        answer = getInputString(question3);
        if(answer.equalsIgnoreCase("Shemp")){
            System.out.println ("You're Right");
            score++;
        }
        else
            System.out.println("Sorry, that was the wrong answer");

        // code for question 4
        answer = getInputString(question4);
        if(answer.equalsIgnoreCase("Curly")){
            System.out.println ("You're Right");
            score++;
        }
        else
            System.out.println("Sorry, that was the wrong answer");

        // code for question 5
        answer = getInputString(question5);
        if(answer.equalsIgnoreCase("Larry")){
            System.out.println ("You're Right");
            score++;
        }
        else
            System.out.println("Sorry, that was the wrong answer");


        System.out.println("You got " + score + " answers correct");
    }

// helper method
// method getInput
// requirements: caller must accept a double return type
// results: displays a prompt string and accepts a double as a response

    private static String getInputString(String prompt){


        // local variable to return
        String stringReturn = "";

        // prompt the user for input
        System.out.print(prompt + " ");
        // get the string response from the console
        stringReturn = scanner.nextLine();

        // return the response
        return stringReturn;
    }
}
