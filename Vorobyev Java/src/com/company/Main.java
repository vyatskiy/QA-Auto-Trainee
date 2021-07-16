package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number > 7)
            System.out.println("Привет");
        scanner.nextLine();

        // Task 2
        System.out.print("Введите имя: ");
        String temp = scanner.nextLine();
        String str = "Вячеслав";
        String answer = (str.equals(temp)) ? "Привет, Вячеслав" : "Нет такого имени";
        System.out.println(answer);

        // Task 3
        System.out.print("Введите размер массива: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < count; i++)
            array[i] = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            if (array[i] % 3 == 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
