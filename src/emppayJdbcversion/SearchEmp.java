package emppayJdbcversion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SearchEmp {
    SqlConnection sqlConnection = new SqlConnection();
    public void SearchEmp(List<EmployeeDetails>arr,String name)  {
        try {
            Connection conn = sqlConnection.connect();
            PreparedStatement stmt1 = conn.prepareStatement("select * from arpit.employee e where FIRST_NAME =?;");
            stmt1.setString(1, name);
            ResultSet rs = stmt1.executeQuery();
            while (rs.next()) {
                String fname = rs.getString("FIRST_NAME");
                String lname = rs.getString("LAST_NAME");
                String mail = rs.getString("EMAIL");
                System.out.println("FIRST NAME IS: " + fname + " ,LAST NAME IS  " + lname + " ,AND EMAIL IS " + mail);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
