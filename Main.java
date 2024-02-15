

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What is the speed of your car?");

            var speed = scanner.nextDouble();

            System.out.println("How many hours do you plan to spend on the road?");
            var hours = scanner.nextDouble();

            if (hours == 0)
             break;

            var result = hours * speed;

            System.out.println("You will travel:" + result + "km");
        }
    }
}