package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class First {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/tables2";
        String un="root";
        String pw="Swathi@130601";

        String query = "SELECT Eid, Ename, Edept FROM FIRST";
        // Class.forName("com.mysql.jdbc.Driver");
        Connection cn= DriverManager.getConnection(url,un,pw);
        Statement st= cn.createStatement();
        String sql = "DELETE FROM FIRST " +
                "WHERE Eid = 8";
        st.executeUpdate(sql);
        ResultSet rs=st.executeQuery(query);
        while(rs.next()){
            System.out.println(rs.getInt("EID")+" "+rs.getString("Ename")+" "+rs.getString("Edept"));
        }

        st.close();
        cn.close();
    }
}
