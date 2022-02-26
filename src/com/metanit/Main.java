package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = input.nextInt();
        int Moy[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            Moy[i] = input.nextInt();
        }
        System.out.println ("Полученный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + Moy[i]);
        }
System.out.println();
        var min = Moy[0];
        for (double num : Moy) {
            if (num < min) {
                min = (int) num;
            }
        }
        System.out.println("Минимальный элемент элемент: " + min);
double sum = 0;
        for (int i = 0; i < Moy.length; i++){
         sum = Moy[i] + sum;
        }
        double crednee = sum / Moy.length;
        System.out.println("Средний элемент: " + crednee);
        double suma = min + crednee;
        System.out.println("Сумма минимального элемента и среднего арифметического = "+ suma);

    }
}
