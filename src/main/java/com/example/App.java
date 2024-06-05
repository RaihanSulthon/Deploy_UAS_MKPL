package com.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Kalkulator Biasa");
            System.out.print("Masukkan angka pertama: ");
            double num1 = scanner.nextDouble();
            System.out.print("Masukkan Simbol Perhitungan (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            System.out.print("Masukkan angka kedua: ");
            double num2 = scanner.nextDouble();

            double result =calculate(num1, num2, operator);

   
            System.out.println("Hasil: " + result);
        }
        
    }
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+' -> {
                return num1 + num2;
            }
            case '-' -> {
                return num1 - num2;
            }
            case '*' -> {
                return num1 * num2;
            }
            case '/' -> {
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Error! Pembagian dengan nol tidak bisa.");
                }
            }
            default -> throw new IllegalArgumentException("Operator tidak valid!");
        }
    }
}