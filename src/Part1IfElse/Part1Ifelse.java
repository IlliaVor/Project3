package Part1IfElse;

import java.util.Scanner;

public class Part1Ifelse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hey! I made a little quiz here, and you have the opportunity to participate in it:)");
        System.out.println("The theme of the quiz is music");
        System.out.println("let's get started!");

        int score = 0;

        System.out.println("The first genres that stood out were church music. These were the Matins and the Mass. Later, the development of musical genres was very rapid. So question number 1. How many main genres of music are there now? ");
        int num = in.nextInt();

        if (num == 4) {
            System.out.println("Yeah! You're right.");
            score++;
        } else if (num != 4) {

            System.out.println("You were close, the correct answer is 4.");
        }

        System.out.println("Question 2: Who is known as the 'King of Pop'?");
        System.out.println("1) Elvis Presley");
        System.out.println("2) Michael Jackson");
        System.out.println("3) Madonna");
        char answer1 = in.next().charAt(0);

        if (answer1 == '2') {
            System.out.println("Correct! Michael Jackson is the 'King of Pop'.");
            score++;
        } else {
            System.out.println("Sorry, that's incorrect. The correct answer is '2) Michael Jackson'.");
        }

        System.out.println("Question 3: Which band released the album 'Abbey Road'?");
        System.out.println("1) The Rolling Stones");
        System.out.println("2) The Beatles");
        System.out.println("2) Led Zeppelin");
        System.out.print("Your answer: ");
        char answer2 = in.next().charAt(0);

        if (answer2 == '1' ) {
            System.out.println("Correct! 'Abbey Road' is by The Beatles.");
            score++;
        } else {
            System.out.println("Sorry, that's incorrect. The correct answer is '2) The Beatles'.");
        }
        System.out.println("Question 4: Who sang the song 'Bohemian Rhapsody'?");
        System.out.println("1) The Rolling Stones");
        System.out.println("2) Queen");
        System.out.println("3) Pink Floyd");
        System.out.print("Your answer: ");
        char answer3 = in.next().charAt(0);

        if (answer3 == '2' ) {
            System.out.println("Correct! 'Bohemian Rhapsody' is by Queen.");
            score++;
        } else {
            System.out.println("Sorry, that's incorrect. The correct answer is '2' Queen'.");
        }
        System.out.println("Quiz Complete!");
        System.out.println("Your score: " + score + " out of 4");

        // Provide a music-related comment based on the score
        if (score == 3) {
            System.out.println("Congratulations! You're a music expert!");
        } else if (score >= 1) {
            System.out.println("Not bad! You know your music.");
        } else {
            System.out.println("Keep listening to more music and try again!");
        }

        in.close();


    }

}



