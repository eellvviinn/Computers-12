import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Conditional_Practice {

    public static void main(String[] args) {

        //Output
//      In this section, you're going to try to guess what you think the if statement is and what it does.
//      1. What do you think else if and else are doing? Answer in a comment.
//         else if is checking whether something matches the restrictions after only if it fails the previous restriction check
//         else is giving an input if all of the restrictions/checks dont work, doing whatever is in the else without restrictions.
//      2. Remove the else part at the beginning of one of the else if statements. What difference does that make? Why? Answer in a comment.
//         removing one of the else parts in this case does nothing, because the else if is the exact opposite of the previous if
//         however, if the restrictions were slightly different and could be met by both, it would end up printing both statements
        int people = 30;
        int cars = 40;
        int buses = 15;

        if ( cars > people ) {
            System.out.println( "We should take the cars." );
        } else if ( cars < people ) {
            System.out.println( "We should not take the cars." );
        } else {
            System.out.println( "We can't decide." );
        }
        if ( buses > cars ) {
            System.out.println( "That's too many buses." );
        } else if ( buses < cars ) {
            System.out.println( "Maybe we could take the buses." );
        } else {
            System.out.println( "We still can't decide." );
        }
        if ( people > buses ) {
            System.out.println( "All right, let's just take the buses." );
        } else {
            System.out.println( "Fine, let's stay home then." );
        }

//        Assignment 2
//      how old are you specifically? using if statements, else if, and else statements, make a program which displays a different message depending on the age given
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");
        String name = scanner.nextLine();
        System.out.println("Ok, " + name + ", how old are you?");
        int age = scanner.nextInt();
        if (age >= 25) {
            System.out.println("You can do pretty much anything.");
        } else if (age >= 18) {
            System.out.println("You can vote but not rent a car.");
        } else if (age >= 16) {
            System.out.println("You can drive but not vote.");
        } else {
            System.out.println("You can't drive.");
        }

//        Assignment 3
        Scanner scanner1 = new Scanner(System.in);
//        double venus = 0.78;
//        double mars = 0.39;
//        double jupiter = 2.65;
//        double saturn = 1.17;
//        double uranus = 1.05;
//        double neptune = 1.23;
        System.out.println("Please enter your current earth weight: ");
        int weight = scanner1.nextInt();
        System.out.println("I have information for the following planets: ");
        System.out.println("    1. Venus    2. Mars     3. Jupiter");
        System.out.println("    4. Saturn   5. Uranus   6. Neptune");
        System.out.println("Which planet are you visiting?");
        int planet = scanner1.nextInt();
        if (planet == 1) {
            System.out.println("Your weight would be " + weight * 0.78 + " pounds on that planet.");
        } else if (planet == 2) {
            System.out.println("Your weight would be " + weight * 0.39 + " pounds on that planet.");
        } else if (planet == 3) {
            System.out.println("Your weight would be " + weight * 2.65 + " pounds on that planet.");
        } else if (planet == 4) {
            System.out.println("Your weight would be " + weight * 1.17 + " pounds on that planet.");
        } else if (planet == 5) {
            System.out.println("Your weight would be " + weight * 1.05 + " pounds on that planet.");
        } else if (planet == 6) {
            System.out.println("Your weight would be " + weight * 1.23 + " pounds on that planet.");
        } else {
            System.out.println("not a valid planet. nice try lil bro");
        }

//        A Little Quiz
        Scanner quizBot = new Scanner(System.in);
        int score = 0;
        System.out.println("Are you ready for a quiz?");
        String start = quizBot.nextLine();
        if (start.equals("yes")) {
            System.out.println("Lets-a go!");
        } else if (start.equals("no")) {
            System.out.println("too bad");
        } else {
            System.out.println("that is not a valid command.");
        }

        System.out.println("Question 1: 1 + 1 = ?");
        System.out.println("                a) 11");
        System.out.println("                b) window");
        System.out.println("                c) 2");
        System.out.println("                d) your mother");
        String q1 = quizBot.nextLine();
        if (q1.equals("a")) {
            System.out.println("You silly goose, incorrect");
        } else if (q1.equals("b")) {
            System.out.println("You silly goose, incorrect");
        } else if (q1.equals("c")) {
            System.out.println("congratulations little man, you got it correct");
            score++;
        } else if (q1.equals("d")) {
            System.out.println("You silly goose, incorrect");
        } else {
            System.out.println("oh naur, that wasn't even an option!");
        }

        System.out.println("Question 2: What is the probability of you answering this question right?");
        System.out.println("                a) 25%");
        System.out.println("                b) 50%");
        System.out.println("                c) 25%");
        System.out.println("                d) 00%");
        String q2 = quizBot.nextLine();
        if (q2.equals("a")) {
            System.out.println("You silly goose, incorrect");
        } else if (q2.equals("b")) {
            System.out.println("You silly goose, incorrect");
        } else if (q2.equals("c")) {
            System.out.println("You silly goose, incorrect");
        } else if (q2.equals("d")) {
            System.out.println("You silly goose, incorrect");
        } else {
            System.out.println("oh naur, that wasn't even an option!");
        }

        System.out.println("Question 3: You want to eat Oreos, however there is no more milk. Your dad, seeing a great opportunity arising, goes to the store to buy milk. The nearest milk market is 6 kilometers away. If your dad walks at a speed of 10 meters per minute, and he takes 2 hours choosing which milk to buy at the store (it needs to be juuuust right), how long will it take for your dad to bring home the milk?");
        System.out.println("                a) 10 hours");
        System.out.println("                b) 12 hours");
        System.out.println("                c) 20 hours");
        System.out.println("                d) 22 hours");
        System.out.println("                e) trick question: your dad is not coming back");
        String q3 = quizBot.nextLine();
        if (q3.equals("a")) {
            System.out.println("You silly goose, incorrect");
        } else if (q3.equals("b")) {
            System.out.println("You silly goose, incorrect");
        } else if (q3.equals("c")) {
            System.out.println("You silly goose, incorrect");
        } else if (q3.equals("d")) {
            System.out.println("correct, you nerd");
            score++;
        } else if (q3.equals("e")) {
            System.out.println("you've gotten it correct, but at what cost :(");
            score++;
        } else {
            System.out.println("oh naur, that wasn't even an option!");
        }
        System.out.println("congratulations on completing the quiz! would you like to see your score? (y/n)");
        String result = quizBot.nextLine();
        if (result.equals("y")) {
            System.out.println("you have achieved a high score of " + score);
        } else if (result.equals("n")) {
            System.out.println("geegee");
        } else if (result.equals("harry maguire")) {
            System.out.println("congratulations, you have found treasure! your score is now " +  420);
        } else {
            System.out.println("game over");
        }







    }

}
