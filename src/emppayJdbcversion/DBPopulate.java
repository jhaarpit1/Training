package emppayJdbcversion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.Connection;

public class DBPopulate {
    SqlConnection sqlConnection = new SqlConnection();
    public void DBpopulate(List<EmployeeDetails> arr)  {
        try {
            Connection conn = sqlConnection.connect();
            Statement stmt = conn.createStatement();
            for(EmployeeDetails employeeDetails:arr) {
                PreparedStatement stmt1 = conn.prepareStatement("insert into EMPLOYEE values(?,?,?)");
                stmt1.setString(1, employeeDetails.getFirstName());
                stmt1.setString(2, employeeDetails.getLastName());
                stmt1.setString(3, employeeDetails.getEmail());
                int check = stmt1.executeUpdate();
                System.out.println(check+" record inserted");
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
