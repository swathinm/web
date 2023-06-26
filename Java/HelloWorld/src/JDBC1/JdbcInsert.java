package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

 class JdbcInsert {
    public static void main(String[] args) throws Exception {
        final String url = "jdbc:mysql://localhost:3306/aliens";
        final String user = "root";
        final String password = "Swathi@130601";

//        try (Connection con = DriverManager.getConnection(url, user, password);
//             Statement st = con.createStatement()) {
//            String query = "SELECT ID, NAME, ADDRESS FROM PERSON";
//            ResultSet rs = st.executeQuery(query);
//
//            boolean flag = false;
//            while (rs.next()) {
//                flag = true;
//                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
//            }
//
//            if (flag) {
//                System.out.println("\nRecords retrieved and displayed");
//            } else {
//                System.out.println("Record not found");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        String query = "SELECT IDEMPT FROM EMPT";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println(rs.getInt(1) );
        }
        rs.close();
        con.close();
    }
}

