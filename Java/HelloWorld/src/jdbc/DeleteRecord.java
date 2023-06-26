package jdbc;

import java.sql.*;

public class DeleteRecord {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/tables2";
        String un="root";
        String pw="Swathi@130601";

        Connection cn= DriverManager.getConnection(url,un,pw);
        Statement st=cn.createStatement();
        String query="DELETE FROM FIRST WHERE EID = 7";

        st.executeUpdate(query);
        System.out.println("Query Deleted");

        String query1="SELECT * FROM FIRST";

        ResultSet rs= st.executeQuery(query1);

        while (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }



    }
}
