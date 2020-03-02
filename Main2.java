package com.company;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int sum[] = new int[4], bank[] = new int[4];
        System.out.println("Введите количество купюр следующих номиналов: 1000 500 100 30");
        Scanner scan = new Scanner(System.in);
        bank[3] = scan.nextInt();
        bank[2] = scan.nextInt();
        bank[1] = scan.nextInt();
        bank[0] = scan.nextInt();
        int s = bank[3] * 1000 + bank[2] * 500 + bank[1] * 100 + bank[0] * 30;
        System.out.println("Введите сумму, которую желаете получить");
        int x = scan.nextInt();
        if (x > s || x % 10 != 0) {
            System.out.println("Данную сумму получить невозможно");
        }
        else {
            while (x % 100 != 0 && x >= 30 && bank[0] > 0){
                x -= 30;
                bank[0]--;
                sum[0]++;
            }
            while (x >= 1000 && bank[3] > 0){
                x -= 1000;
                bank[3]--;
                sum[3]++;
            }
            while (x >= 500 && bank[2] > 0){
                x -= 500;
                bank[2]--;
                sum[2]++;
            }
            while (x >= 100 && bank[1] > 0){
                x -= 100;
                bank[1]--;
                sum[1]++;
            }
            if (x == 0) {
                System.out.println((sum[3] != 0 ? sum[3] + " купюр(ы) по 1000 руб, " : "") + (sum[2] != 0 ? sum[2] + " купюр(ы) по 500 руб," : ""));
                System.out.println((sum[1] != 0 ? sum[1] + " купюр(ы) по 100 руб, " : "") + (sum[0] != 0 ? sum[0] + " купюр(ы) по 30 руб," : ""));
            } else {
                System.out.println("Данную сумму получить невозможно");
            }
        }
    }
}
