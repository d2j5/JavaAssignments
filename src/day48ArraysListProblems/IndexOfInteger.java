package day48ArraysListProblems;
import java.util.ArrayList;
import java.util.Scanner;
public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.println("Enter an integer: ");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }
        System.out.println("Done entering integers into the list");
        System.out.println("What number are you looking for in the list?");
        int wantedNumber = scanner.nextInt();
        for (int i = 0; i <numbers.size(); i++) {
            if (numbers.get(i) == wantedNumber) {
                System.out.println(wantedNumber + " is at index " + i);
            }
        }
   }
}
