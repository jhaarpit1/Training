package DAY_1_DSA;
import java.util.*;
public class Array_Of_Digits {
    public static void main(String[] args) {
        Character arr[] = {'3' ,'2','*','#','7','8','$','5','$','9'};
        ArrayList<Character> digits = new ArrayList<Character>();
        ArrayList<Character> specials = new ArrayList<Character>();
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i])==true){
                digits.add(arr[i]);
            }
            else specials.add(arr[i]);
        }
        System.out.println(digits);
        System.out.println(specials);

    }
}
