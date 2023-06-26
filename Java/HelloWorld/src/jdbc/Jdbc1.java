package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc1 {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/emp";
        String username = "root";
        String password = "Swathi@130601";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);

        Statement st = con.createStatement();
//        String query = ;

        ResultSet rs = st.executeQuery("SELECT ID, NAME FROM DETAILS");

        while (rs.next()) {
            System.out.println(rs.getInt("ID") + " " + rs.getString("NAME"));
        }

        rs.close();
        st.close();
        con.close();
    }
}
