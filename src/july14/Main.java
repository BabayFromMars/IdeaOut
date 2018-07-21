package july14;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ForIdea", "babay", "12345");
        System.out.println("All right");
        System.out.println("====================Employee=========================");
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from s");
        ArrayList<Employee> employees = new ArrayList<>();
        while (resultSet.next()) {
            employees.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
                    resultSet.getInt(4), resultSet.getDouble(5)));
        }
        employees.forEach(System.out::println);
        System.out.println("====================Customers=========================");
        ResultSet resultSet2 = statement.executeQuery("Select * from c");
        ArrayList<Customers> customers = new ArrayList<>();
        while (resultSet2.next()) {
            customers.add(new Customers(resultSet2.getInt(1), resultSet2.getString(2), resultSet2.getString(3),
                    resultSet2.getInt(4), resultSet2.getInt(5)));
        }
        customers.forEach(System.out::println);
        con.close();
    }



}
//mysql://localhost/mysql