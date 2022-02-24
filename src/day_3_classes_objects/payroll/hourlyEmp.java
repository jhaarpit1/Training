package day_3_classes_objects.payroll;

public class hourlyEmp extends empDetails implements employee {
    int hours;
    int ratePerHour;
    hourlyEmp(String firstName, String lastName, String phoneno, String email, int Hours, int RateperHour){
        super(firstName,lastName,email,phoneno);
        hours = Hours;
        ratePerHour = RateperHour;
    }


    @Override
    public double getPayroll() {
        if(hours>40) return (hours-40)*ratePerHour+40*ratePerHour;
        return 40*ratePerHour;
    }
    @Override
    public String toString (){
        return "Name is "+firstName+" "+super.LastName+" And Phone no and email is "+super.phoneno+","+email+"  and payroll is:"+getPayroll();
    }
}
