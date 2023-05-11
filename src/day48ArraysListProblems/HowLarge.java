package day48ArraysListProblems;
import java.util.ArrayList;
import java.util.Scanner;
public class HowLarge {
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
        int count = strings.size();
        System.out.println("The total amount of items int he list was:"+count);
    }
}
