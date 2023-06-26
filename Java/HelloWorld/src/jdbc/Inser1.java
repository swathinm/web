package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Inser1 {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/tables2";
        String un="root";
        String pw="Swathi@130601";

        Connection cn= DriverManager.getConnection(url,un,pw);
        Statement st= cn.createStatement();

        String query="CREATE TABLE SCHOOL" +
                "(EID INTEGER," +
                "ENAME VARCHAR(45)," +
                "EDEPT VARCHAR(45))";

        st.executeUpdate(query);
        System.out.println("Table Created");

        String query1="INSERT INTO SCHOOL VALUES(1,'SWATHI','SPORTS') ";
        st.executeUpdate(query1);
        query1="INSERT INTO SCHOOL VALUES(2,'MEENI','SPORTS') ";
        st.executeUpdate(query1);
        query1="INSERT INTO SCHOOL VALUES(3,'CARTOON','TV') ";
        st.executeUpdate(query1);
        query1="INSERT INTO SCHOOL VALUES(4,'MANASA','JAVA') ";
        st.executeUpdate(query1);
        query1="INSERT INTO SCHOOL VALUES(5,'SRI','LEAD') ";
        st.executeUpdate(query1);

        System.out.println("Data Inserted");
        String s="SELECT * FROM SCHOOL";

        ResultSet rs=st.executeQuery(s);
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }



        String q2="DELETE FROM SCHOOL " +
                "WHERE EID = 3";
        st.executeUpdate(q2);
        System.out.println("Deleted Sucessfully");

        String t="SELECT * FROM SCHOOL";

        ResultSet r= st.executeQuery(t);
        while(r.next()){
            System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3));
        }

        String q3="ALTER TABLE SCHOOL DROP EDEPT";
        st.executeUpdate(q3);
        System.out.println("Altered sucessfully");

        String q="SELECT * FROM SCHOOL";

        ResultSet p=st.executeQuery(q);
        while(p.next()){
            System.out.println(p.getInt(1)+" "+p.getString(2));

        }


        rs.close();
        r.close();
        st.close();
        cn.close();


    }
}
