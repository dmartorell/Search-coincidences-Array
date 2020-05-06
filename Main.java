package com.dmartorell;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[] array(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        return array;
    }

    public static void main(String[] args) {

        int[] array = array (100);
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Número: ");
        int num = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                counter += 1;
            }
        }
        System.out.printf("El número %d aparece %d veces.\n", num, counter);

    }
}
