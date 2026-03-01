package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w programie Java!");
        
        while (true) {
            System.out.print("Podaj imie (lub wpisz 'exit'): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Czesc " + input + "!");
        }
        scanner.close();
    }
}