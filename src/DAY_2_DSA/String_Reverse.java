package DAY_2_DSA;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char array[] = input.toCharArray();
        String res = "";
        System.out.println(reverseRecursive(array,res,input.length()-1));
        System.out.println(reverseIterative(array,res));

    }
    public static String reverseRecursive(char arr[], String res , int ind){
        if(ind==-1) return res;
        res+=arr[ind];
        return reverseRecursive(arr,res,ind-1);
    }
    public static String reverseIterative(char arr[], String res){
        for(int i=arr.length-1;i>=0;i--){
            res+=arr[i];
        }
        return res;
    }
}
