package day_3_classes_objects.payrollupdate;

public class SalariedEmp extends empDetails implements employee {
    double weekSalary = 10000;


    public SalariedEmp(String firstName, String lastName, String phoneNo, String email) {
        super(firstName,lastName,phoneNo,email);
    }


    @Override
    public double getPayroll() {
        return weekSalary;
    }

    public String toString (){
        return "Name is "+firstName+" "+super.LastName+" And Phone no and email is "+super.phoneno+","+email+"  and payroll is:"+getPayroll();
    }
}
