// This is a test comment to trigger the CI/CD pipeline.
// Created to test GitHub Actions
package com.example;

import java.util.Scanner;

class Calculator {

    // Вынесение логики вычислений в метод calculate , который принимает 2 числа и оператор
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Error: Деление на ноль");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Error: Неверный оператор");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        // Вызов метода для вычисления результата
        try {
            double result = calculate(num1, num2, operator);
            System.out.println("Result: " + result);
            // catch ловит исключения (деление на ноль, ввод неверного оператора и выводит соответвующее сообщение)
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
