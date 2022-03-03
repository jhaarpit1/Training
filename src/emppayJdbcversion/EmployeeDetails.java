package emppayJdbcversion;

public class EmployeeDetails {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private int typeOfEmp;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getTypeOfEmp() {
        return typeOfEmp;
    }

    public EmployeeDetails(String firstName, String lastName, String phone, String email, int typeOfEmp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.typeOfEmp = typeOfEmp;
    }
    SalariedEmp salariedEmp = new SalariedEmp();
    BaseSalariedEmp baseSalariedEmp = new BaseSalariedEmp();

    public int getSalary(int typeOfEmp){
        int salary=0;
        if(typeOfEmp==1)
            salary= salariedEmp.getPayroll();

        if(typeOfEmp==2)
            salary = baseSalariedEmp.getPayroll();
        return salary;
    }


}
