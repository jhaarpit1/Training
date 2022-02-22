/*1. A company pays its employees on a weekly basis. The employees are of four types:
        a. Salaried employees are paid a fixed weekly salary regardless of the number of hours worked,
        b. hourly employees are paid by the hour and receive overtime pay (i.e., 1.5 times their hourly salary rate) for all hours worked in excess of 40 hours,
        c. commission employees are paid 15 percent of their sales and
        d. base-salaried commission employees receive a base salary plus 12 percent of their sales.
        For the current pay period, the company has decided to reward bonus to base-salaried-commission employees by adding 10% to their base salaries.



        Write an java program that performs its payroll calculations.*/

package day_3_classes_objects;

import java.util.Scanner;

public class emp_payroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        switch (id){
            case 1:
                System.out.println("fixed salary");
                break;

            case 2:
                System.out.println("ENTER NUMBER OF HOURS AND PAY PER DAY:");
                int hours = sc.nextInt();
                int pay_per_day = sc.nextInt();
                int rem = 0;
                if(hours>40){
                    rem=hours-40;
                    rem*=1.5*pay_per_day;

                }
                System.out.println(rem+40*pay_per_day);
                break;

            case 3:
                System.out.println("ENTER SALES VALUE:");
                int sales = sc.nextInt();
                System.out.println(sales*15/100);
                break;

            case 4:
                System.out.println("ENTER BASE SALARY AND SALES VALUE:");
                int base_sal = sc.nextInt();
                int sales1 = sc.nextInt();
                base_sal+=base_sal*10/100;
                base_sal+=sales1*12/100;
                System.out.println(base_sal);
                break;

            default:
                System.out.println("ERROR :Enter Correct ID : 1<=ID<=4");
        }


    }
}
