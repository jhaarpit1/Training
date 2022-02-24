package day_3_classes_objects.payroll;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    static HashMap<String, employee> hmap = new HashMap<String,employee>();
    public static void main(String[] args) {
        SalariedEmp salemp = new SalariedEmp("a","b","1","aa");
        hmap.put(salemp.firstName,salemp);
        salemp = new SalariedEmp("b","c","2","dd");
        hmap.put(salemp.firstName,salemp);

        hourlyEmp hremp = new hourlyEmp("aa","bb","123","acd",50,100);
        hmap.put(hremp.firstName,hremp);

        commisionEmp commEmp = new commisionEmp("aaa","bbb","1211","yyy",12000,12);
        hmap.put(commEmp.firstName,commEmp);

        baseSalariedEmp basesalemp = new baseSalariedEmp("kkk","ggg","1122","HEH",12000,10,12);
        hmap.put(basesalemp.firstName,basesalemp);

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(hmap.get(s));

    }
}
