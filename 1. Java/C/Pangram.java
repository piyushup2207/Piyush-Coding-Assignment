import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = true;
        for (char c = 'a'; c <= 'z'; c++) {
            if (!input.contains(Character.toString(c))) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The given input is a pangram");
        } else {
            System.out.println("The given input is not a pangram");
        }
    }
}