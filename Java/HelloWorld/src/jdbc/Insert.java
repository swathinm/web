package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/tables2";
        String un="root";
        String pw="Swathi@130601";
        // Class.forName("com.mysql.jdbc.Driver");
        Connection cn= DriverManager.getConnection(url,un,pw);
        Statement st= cn.createStatement();
        String query = "CREATE TABLE Sample5" +
                "(EID INTEGER," +
                "ENAME VARCHAR(20)," +
                "EDEPT VARCHAR(45))";
        st.executeUpdate(query);
        System.out.println("Table Created...");
        String query1="INSERT INTO Sample5 VALUES (1,'swathi','IT')";
        st.executeUpdate(query1);
        query1="INSERT INTO Sample5 VALUES (2,'Meeni','IT')";
        st.executeUpdate(query1);





        System.out.println("Inserted data");





        st.close();
        cn.close();
    }
}
