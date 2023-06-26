package jdbc;

import java.sql.*;

public class UpdateRecord {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/tables2";
        String un="root";
        String pw="Swathi@130601";

//        Class.forName()
        Connection cn= DriverManager.getConnection(url,un,pw);
        Statement st=cn.createStatement();
        String query="UPDATE FIRST SET Edept='MBA' WHERE EID IN (6,7)";
        st.executeUpdate(query);
        System.out.println("Updated");

        String query1="SELECT * FROM FIRST";
        ResultSet rs= st.executeQuery(query1);
        while (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }

        rs.close();
        st.close();
        cn.close();

    }

}
