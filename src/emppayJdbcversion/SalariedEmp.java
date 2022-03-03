package emppayJdbcversion;

public class SalariedEmp implements Employee {
    int salary=1000;


    @Override
    public int getPayroll() {
        return salary;
    }
}
