import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getFloatFromUser();
    }

    public static void getFloatFromUser() {
        System.out.println("Input some float number");
        Scanner scanner = new Scanner(System.in);
        String temp;
        while (!isValidInput(temp = scanner.nextLine())) {
            if (temp.trim().isEmpty()) {
                //System.out.println("Line is empty, type something");
                throw new RuntimeException("Line is empty, type something next time");
            } else {
                System.out.println("Input is invalid, please enter a float number (use '.' as delimiter");
            }
        }
        System.out.println("YOU ENTERED = " + temp);
    }

    public static boolean isValidInput(String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
