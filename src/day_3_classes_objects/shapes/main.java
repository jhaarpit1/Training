package day_3_classes_objects.shapes;

import javax.naming.ldap.HasControls;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    static HashMap<String,Shape> hmap = new HashMap<String,Shape>();
    public static void main(String[] args) {
        Square sq = new Square(4, "Square") ;
        hmap.put(sq.name,sq);

        rectangle rec = new rectangle(4,5,"Rectangle");
        hmap.put(rec.name,rec);

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(hmap.get(s));

    }
}
