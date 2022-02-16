package com.company;

import java.util.Scanner;

public class Pattern_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(0);
            }
            for(int j=0;j<i;j++){
                System.out.print(1);
            }
            System.out.print(" ");
        }
    }
}
