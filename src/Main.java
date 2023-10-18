package dz1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое значение: ");
        int a = scanner.nextInt();
        System.out.println("Второе значение: ");
        int b = scanner.nextInt();
        double f = a + b;
        System.out.println(f);
        double j = a - b;
        System.out.println(j);
        double c = a * b;
        System.out.println(c);
        double d = a / b;
        System.out.println(d);
        System.out.printf("сработало)");
    }
}