import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.Class.forName;

public class Jdbc {
    public static void main(String[] args) throws SQLException {
        //Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/jdbc";
        String username="root";
        String password="Karthi@123";

        Connection con = DriverManager.getConnection(url,username,password);
        Statement stmt = con.createStatement();

        String q1 = "create table staffs(sid int, sname varchar(30))";
        stmt.executeUpdate(q1);

        String q2 = "insert into student values(5, 'antony', 'Bangalore')";
        int val1=stmt.executeUpdate(q2);
        System.out.println("Number of rows affected : "+ val1);

        String q3 = "update student set location='Erode' where rno=2";
        int val2=stmt.executeUpdate(q3);
        System.out.println("Number of rows affected : "+ val2);

        String sql = "delete from student where rno=2";
        int val3=stmt.executeUpdate(sql);
        System.out.println("Number of rows affected : "+ val3);

        con.close();
    }
}
