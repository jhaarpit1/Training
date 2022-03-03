package emppayjdbcversion;

import java.util.Scanner;

public class BaseSalariedEmp implements Employee {
    public void hours(){
        System.out.println("Enter number of hours:");
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        setHours(hours);
    }
    public int getHours() {
        return hours;
    }


    public void setHours(int hours) {
        this.hours = hours;
    }

    private int hours;
    private int ratePerHour = 100;

    @Override
    public int getPayroll() {
        BaseSalariedEmp baseSalariedEmp = new BaseSalariedEmp();
        baseSalariedEmp.hours();
        return  (baseSalariedEmp.getHours()-40)*150+40*ratePerHour;

    }
}
