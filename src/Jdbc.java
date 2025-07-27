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

        String sql = "select * from student";
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
            System.out.println(rs.getInt("rno")+" "+rs.getString("name")+" "+rs.getString("location"));
        }

        con.close();
    }
}
