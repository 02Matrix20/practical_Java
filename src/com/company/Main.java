package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер последовательностей:");
        int j = in.nextInt();
        int a[] = new int[j];
        int b[] = new int[j];
        System.out.println("Введите первую числовую последовательность:");
        for (int i=0; i<j; i++){
            a[i] = in.nextInt();
        }
        System.out.println("Введите вторую числовую последовательность");
        for (int k=0; k<j; k++){
            b[k] = in.nextInt();
        }
        int different = 0;
        for (int i=0; i<j; i++)
            if (a[i]!=b[i]) {
                System.out.println("Различные:" + " " + a[i] + "-" + b[i]);
                different++;
            }
        if (different == 0)
            System.out.println("Одинаковые");
        int sum = 0;
        int sum2 = 0;
        for (int i=0; i<j; i++)
            if (a[i]!=b[i]) {
                sum = sum +a[i];
                sum2 = sum2 +b[i];
                different++;
            }
        System.out.println(sum);
        System.out.println(sum2);
        if (sum>sum2 ) System.out.println("1");
        if (sum2>sum ) System.out.println("2");
    }
}
