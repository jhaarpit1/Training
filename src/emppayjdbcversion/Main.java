package emppayjdbcversion;

import day_3_classes_objects.logingpayroll.DBPopulate;
import day_3_classes_objects.logingpayroll.SearchEmp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees to be registered: ");
        int noOfEmp = sc.nextInt();
        List<EmployeeDetails> empList = new ArrayList<EmployeeDetails>();
        while(noOfEmp>0) {
            System.out.println("ENTER FIRST NAME, LAST NAME, FOLLOWED BY EMAIL AND PHONE NUMBER AND TYPE OF EMPLOYEE");
            String firstName = sc.next();
            String lastName = sc.next();
            String phone = sc.next();
            String email = sc.next();
            int typeOfEmp = sc.nextInt();
            empList.add(new EmployeeDetails(firstName, lastName, email, phone, typeOfEmp));
            noOfEmp--;
        }

        DBPopulate dbPopulate = new DBPopulate();
        dbPopulate.DBpopulate(empList);
        System.out.println("Enter name of the Employee to be searched");
        String name = sc.next();
        SearchEmp searchEmp = new SearchEmp();
        searchEmp.SearchEmp(empList,name);

    }
}
