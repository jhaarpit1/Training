package day_3_classes_objects;

import java.util.ArrayList;
import java.util.Scanner;

public class Print_circle_area_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<circle> arr = new ArrayList<>();

        for(int i =0;i<n;i++){
            circle c1 = new circle();
            c1.setColor(sc.next());
            c1.setName(sc.next());
            c1.setRadius(sc.nextInt());

            arr.add(c1);

        }
        for(int i=0;i<n;i++){
            System.out.println("Area of circle named "+arr.get(i).getName()+" of "+arr.get(i).getColor()
                    +" color is of area "+arr.get(i).getRadius()*3.14);

        }
    }






}
