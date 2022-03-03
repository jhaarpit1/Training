package emppayJdbcversion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
    static {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("class loaded sucessfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Unable To Load The class");
        }
    }
    public Connection connect(){
        Connection con = null;
        try{
            String URL = "jdbc:mysql://192.168.0.156/arpit";

            con = DriverManager.getConnection(URL, "root", "root");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
