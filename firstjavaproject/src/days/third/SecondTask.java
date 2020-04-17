package days.third;

import days.second.NumberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SecondTask {
    private double sanaudos;
    private double atstumas;

    public static void main(String[] args) {

        SecondTask secondTask = new SecondTask();
        secondTask.readData();
        DecimalFormat decimalFormat = new DecimalFormat("00.00");
        System.out.println("Automobilis vidutiniskai sunaudoja: " + decimalFormat.format(secondTask.countAverage()));

    }

    private void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite nuvaziotus km:");
        atstumas= NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite kuro sanaudas:");
        sanaudos = NumberUtils.getCorrectNumber(scanner);

    }
    private double countAverage() {
        return ((sanaudos *100) / atstumas);
    }
}
