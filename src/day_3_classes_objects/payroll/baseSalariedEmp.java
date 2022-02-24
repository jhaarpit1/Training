package day_3_classes_objects.payroll;

public class baseSalariedEmp extends empDetails implements employee{
    double baseSal = 10000;
    double sales;
    double bonus;
    double percent;

    baseSalariedEmp(String firstName, String lastName, String phoneno, String email, double sales, double bonus, double percent){
        super(firstName,lastName,email,phoneno);
        sales = sales;
        bonus = bonus;
        percent = percent;
    }
    @Override
    public double getPayroll() {
        return baseSal*0.1+baseSal+(baseSal*percent)/100;
    }
    @Override
    public String toString (){
        return "Name is "+firstName+" "+super.LastName+" And Phone no and email is "+super.phoneno+","+email+"  and payroll is:"+getPayroll();
    }
}
