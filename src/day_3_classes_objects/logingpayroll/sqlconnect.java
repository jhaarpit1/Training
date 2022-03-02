package day_3_classes_objects.logingpayroll;


import java.sql.*;
import java.util.Map;

public class sqlconnect {
    static {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("class loaded sucessfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Unable To Load The class");
        }
    }

    public static void sqlConnect(Map<String,employee> hmap,String s) {

        Connection con = null;

        Statement stmt = null;

        ResultSet rs = null;

        try {
            String URL = "jdbc:mysql://192.168.0.156/arpit";

            con = DriverManager.getConnection(URL, "root", "root");
            stmt = con.createStatement();
            String sql = "create table EMPLOYEE("
                    + "FIRST_NAME VARCHAR(20) NOT NULL, "
                    + "LAST_NAME VARCHAR(20) NOT NULL, "
                    + "EMAIL VARCHAR(20) NOT NULL, "
                    + "PRIMARY KEY (EMAIL) )";
            int i = stmt.executeUpdate(sql);
            if(i != 0)
            {
                System.out.println("Table is created");
            }
            else
            {
                System.out.println("Table is not created");
            }

            for (Map.Entry mapElement : main.hmap.entrySet()){
                employee emp = (employee) mapElement.getValue();
                empDetails empDet = (empDetails) mapElement.getValue();
                PreparedStatement stmt1=con.prepareStatement("insert into EMPLOYEE values(?,?,?)");
                String first_name = empDet.firstName;
                String last_name = empDet.LastName;
                String email = empDet.email;
                stmt1.setString(1,first_name);
                stmt1.setString(2,last_name);
                stmt1.setString(3,email);
                int check = stmt1.executeUpdate();
                System.out.println(check+" record inserted");
            }
            PreparedStatement stmt1=con.prepareStatement("select * from arpit.employee e where FIRST_NAME =?;");
            stmt1.setString(1,s);
            rs = stmt1.executeQuery();
            while ( rs.next() ) {
                String fname = rs.getString("FIRST_NAME");
                String lname = rs.getString("LAST_NAME");
                String mail = rs.getString("EMAIL");
                System.out.println("FIRST NAME IS: "+fname+" ,LAST NAME IS  "+lname+" ,AND EMAIL IS "+mail);
            }



        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
