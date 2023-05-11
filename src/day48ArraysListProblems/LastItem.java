package day48ArraysListProblems;
import java.util.ArrayList;
import java.util.Scanner;
public class LastItem {
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
        int lastIndex = strings.size() - 1;
        String lastItem = strings.get(lastIndex);
        System.out.println("The last item in the list is: "+lastItem);
    }
}
