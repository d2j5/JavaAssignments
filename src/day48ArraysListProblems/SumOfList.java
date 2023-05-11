package day48ArraysListProblems;
import java.util.ArrayList;
import java.util.Scanner;
public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.println("Enter a number(or 0 to stop) : ");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.print(numbers.get(0));
        for (int i = 1; i < numbers.size(); i++) {
            System.out.print(", "+numbers.get(i));
        }
        System.out.println(" were the items in the list. The sum of that list is: " + sum);

    }
}

