package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Shift_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                result.add(arr[i]);
            }
            if(arr[i]==0){
                count++;
            }
        }
        while(count>0){
            result.add(0);
            count--;
        }
        System.out.println(result);
    }
}
