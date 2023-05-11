package day48ArraysListProblems;
import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            System.out.println("Enter a string: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
         }
        if(strings.size() >= 5) {
            System.out.println("The fifth item in the list is: "+ strings.get(4));
        }

    }
}
