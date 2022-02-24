package day_3_classes_objects.payrollupdate;

public class commisionEmp extends empDetails implements employee {
    double sales;
    double percent;
    commisionEmp(String firstName, String lastName, String phoneno, String email, double sales, double percent){
        super(firstName,lastName,email,phoneno);
        this.sales = sales;
        this.percent = percent;
    }
    @Override
    public double getPayroll() {
        return (sales*percent)/100;
    }

    public String toString (){
        return "Name is "+firstName+" "+super.LastName+" And Phone no and email is "+super.phoneno+","+email+"  and payroll is:"+getPayroll();
    }
}
