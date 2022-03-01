package filehandling;

import org.apache.log4j.Logger;

public class commisionEmp extends empDetails implements employee {
    private static Logger logger = Logger.getLogger( commisionEmp.class);
    double sales;
    double percent;
    commisionEmp(String firstName, String lastName, String phoneno, String email, double sales, double percent){
        super(firstName,lastName,email,phoneno);
        this.sales = sales;
        this.percent = percent;
        logger.info("In the constructor of commisionEmployee.");
    }
    @Override
    public double getPayroll() {
        return (sales*percent)/100;
    }

    public String toString (){
        return "Name is "+firstName+" "+super.LastName+" And Phone no and email is "+super.phoneno+","+email+"  and payroll is:"+getPayroll();
    }
}
