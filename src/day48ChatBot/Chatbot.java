package day48ChatBot;
import java.util.Scanner;
public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greetUser();
        String name = scanner.nextLine();

        askName ();

       guessAge();

        countToNumber();

        testProgrammingKnowledge();

        System.out.println("Thank you for chatting with me, " + name + "!");
    }

    public static void greetUser() {
        System.out.println("Hello! I'm a chat bot. What's your name?");
    }

    public static void askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I've been working a lot lately and my RAM is low, can you please repeat your name?");
        String nameRepeat = scanner.nextLine();
        System.out.println("Thank you "+nameRepeat+"!");
    }

    public static void guessAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Okay my new best friend(It is lonely here), I'm going to guess your age now. Please don't be scared by my precision.");
        System.out.println("Please enter the last digit of your birth year: ");
        int lastDigit = scanner.nextInt();
        int age = (lastDigit + 2) * 5;
        System.out.println("Based on my calculations, and all the information I found about you in the quantum world, your age is " + age + "!");
    }

    public static void countToNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number that you want me to count up to:");
        int number = scanner.nextInt();
        System.out.println("Sure, I'll count up to " + number + " now:");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void testProgrammingKnowledge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's test your programming knowledge. What is the difference between a while loop and a do-while loop?");
        System.out.println("1. A while loop always executes at least once, whereas a do-while loop might not execute at all.");
        System.out.println("2. A do-while loop always executes at least once, whereas a while loop might not execute at all.");
        System.out.println("3. A while loop and a do-while loop are exactly the same.");
        System.out.println("4. A while loop executes a block of code only if a condition is true, whereas a do-while loop executes a block of code once and then repeats it as long as a condition is true.");

        int answer = scanner.nextInt();
        while (answer != 4) {
            System.out.println("Sorry, that's incorrect. Please try again:");
            answer = scanner.nextInt();
        }
        System.out.println("Congratulations! You got it right!");
    }
}
