package filehandling;

import org.apache.log4j.Logger;

public class SalariedEmp extends empDetails implements employee {
    private static Logger logger = Logger.getLogger(SalariedEmp.class);
    double weekSalary = 10000;


    public SalariedEmp(String firstName, String lastName, String phoneNo, String email) {
        super(firstName,lastName,phoneNo,email);
        logger.info("In the SalariedEmployee constructor");
    }


    @Override
    public double getPayroll() {
        return weekSalary;
    }

    public String toString (){
        return "Name is "+firstName+" "+super.LastName+" And Phone no and email is "+super.phoneno+","+email+"  and payroll is:"+getPayroll();
    }
}
