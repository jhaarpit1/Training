package com.company;
import java.util.*;
public class Compare_A_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A==B)System.out.println("TRUE");
        else {
            int diff = (int) ((int)B*0.1);
            if (A<=B+diff && A>=B-diff){
                System.out.println("TRUE");
            }
            else System.out.println("FALSE");
        }
    }
}
