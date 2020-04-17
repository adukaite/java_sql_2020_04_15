package days.third;

import days.second.NumberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * task 4
 */

public class FirstTask {
    private double height;
    private double weight;

    public static void main(String[] args) {

        FirstTask firstTask = new FirstTask();
        firstTask.readRequiredUserData();
        DecimalFormat decimalFormat = new DecimalFormat("00.00");
        System.out.println("Jusu KMI: " + decimalFormat.format(firstTask.countKMI()));

    }

    private void readRequiredUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite savo ugi m:");
        height = NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite savo svori kg:");
        weight = NumberUtils.getCorrectNumber(scanner);


    }
    private double countKMI() {
        return weight / Math.pow(height, 2);
    }
}

