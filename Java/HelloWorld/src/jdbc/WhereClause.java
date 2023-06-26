package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class WhereClause {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/knowprogram";
        String un = "root";
        String pw = "Swathi@130601";

        Connection cn = DriverManager.getConnection(url, un, pw);
        Statement st = cn.createStatement();
       String query = "SELECT ID, NAME, ADDRESS FROM PERSON";

        ResultSet rs = st.executeQuery(query);

        System.out.println("WhereClause without condition");

        String query1 = "SELECT * FROM PERSON";

        ResultSet rs1 = st.executeQuery(query1);
        while (rs1.next()) {
            System.out.println(rs1.getInt(1) + " " + rs1.getString(2) + " " + rs1.getString(3));
        }

        String query2 = "SELECT ID, NAME, ADDRESS FROM PERSON WHERE ID >= 2";
        ResultSet rs2 = st.executeQuery(query2);
        System.out.println("Where condition where id >= 2 Applied ");

        while (rs2.next()) {
            System.out.println(rs2.getInt(1) + " " + rs2.getString(2) + " " + rs2.getString(3));
        }

        String query3 = "SELECT ID, NAME, ADDRESS FROM PERSON WHERE ID <= 2";
        ResultSet rs3 = st.executeQuery(query3);
        System.out.println("Where condition where id <= 2 Applied ");

        while (rs3.next()) {
            System.out.println(rs3.getInt(1) + " " + rs3.getString(2) + " " + rs3.getString(3));
        }



        System.out.println("print avthai le chudu output... ");
        int start = 1; // Starting number
        int end = 3;   // Ending number

        String query11 = "SELECT * FROM PERSON WHERE ID BETWEEN " + start + " AND " + end;

        ResultSet resultSet = st.executeQuery(query11);

        while (resultSet.next()) {
            int id = resultSet.getInt("ID");
            String name = resultSet.getString("NAME");
            String address = resultSet.getString("ADDRESS");

            System.out.println(id + " " + name + " " + address);
        }

        st.close();
        cn.close();
    }
}
