package lesson5.Ex001_SumOfTwoNumbers;

import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public int getValue(String variable) {
        System.out.printf("%s", variable);
        return sc.nextInt();
    }

    public void print(String title, int value) {
        System.out.printf("%s %d\n", title, value);
    }
}

