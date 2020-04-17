package days.second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberUtils {
    public static double getCorrectNumber(Scanner scanner) {
        while (true) {
            try {
                double number = scanner.nextDouble();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Ivedete bloga skaiciu, pakartokite");
                scanner.nextLine();
            }
        }
    }

    public static double getCorrectNumber(Scanner scanner, String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e){
            System.out.println("Ivedete bloga skaiciu teks kartoti");
            return getCorrectNumber(scanner);
        }
    }
}
