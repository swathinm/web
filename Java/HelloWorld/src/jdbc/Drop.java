package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Drop {
    public static void main(String[] args)throws Exception{
        String url="jdbc:mysql://localhost:3306/tables2";
        String un="root";
        String pw="Swathi@130601";

        Connection cn= DriverManager.getConnection(url,un,pw);
        Statement st= cn.createStatement();
        String q="DROP TABLE OP";

        st.executeUpdate(q);

        System.out.println("table dropped");

        st.close();
        cn.close();


    }
}
