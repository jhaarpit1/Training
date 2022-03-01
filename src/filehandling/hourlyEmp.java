package filehandling;

import org.apache.log4j.Logger;

public class hourlyEmp extends empDetails implements employee {
    private static Logger logger = Logger.getLogger(hourlyEmp.class);
    int hours;
    int ratePerHour;
    hourlyEmp(String firstName, String lastName, String phoneno, String email, int Hours, int RateperHour){
        super(firstName,lastName,email,phoneno);
        this.hours = Hours;
        this.ratePerHour = RateperHour;
        logger.info("In the hourlyEmployee constructor");
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
