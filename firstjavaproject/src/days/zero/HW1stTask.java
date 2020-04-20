package days.zero;

import days.second.NumberUtils;

import java.util.Scanner;

/**
 * 1.  	Parašyti programą, kuri leistų vartotojui įvesti norimą skaičių ir po to
 * parašytų ar šis skaičius yra lyginis, ar nelyginis. Užuomina panaudokite % operatoriu.
 */

public class HW1stTask {
    public static void main(String[] args) {
        System.out.println("Iveskite skaiciu");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println(String.format("Ivestas skacius %s yra lyginis", number));
        }else {
            System.out.println(String.format("Ivestas skaicius %s yra nelyginis", number));
        }
    }
}