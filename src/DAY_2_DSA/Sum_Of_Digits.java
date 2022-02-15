package DAY_2_DSA;

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        System.out.println(sumRecursive(n,sum));
        System.out.println(sumRecursive(n,sum));
    }
    public static int sumRecursive(int n, int sum){
        if(n==0) return sum;
        int x = n%10;
        sum+=x;
        n=n/10;
        return sumRecursive(n,sum);
    }
    public static int sumItervative(int n, int sum){
        while(n>0){
            int x = n%10;
            sum+=x;
            n=n/10;
        }
        return sum;
    }
}
