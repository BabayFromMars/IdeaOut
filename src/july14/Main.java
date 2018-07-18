package july14;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ForIdea", "babay", "12345");
        System.out.println("All right");
        con.close();
    }
}
//mysql://localhost/mysql