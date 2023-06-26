package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dropdatabse {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost/";
        String un="root";
        String pw="Swathi@130601";

        Connection cn= DriverManager.getConnection(url,un,pw);
        Statement st=cn.createStatement();
        String q="CREATE DATABASE HELLO";
        st.executeUpdate(q);
        System.out.println("Data base Created");


        String g="USE HELLO";
        st.executeUpdate(g);
        System.out.println("using db....");
        String h="CREATE TABLE KAMODA_DRAGON" +
                "(ID INTEGER," +
                "NAME VARCHAR(47)," +
                "DEPT VARCHAR(54))";
        st.executeUpdate(h);
        System.out.println("table created...");

        String query1="INSERT INTO KAMODA_DRAGON VALUES(1,'SWATHI','SPORTS') ";
        st.executeUpdate(query1);
        query1="INSERT INTO KAMODA_DRAGON VALUES(2,'MEENI','SPORTS') ";
        st.executeUpdate(query1);
        query1="INSERT INTO KAMODA_DRAGON VALUES(3,'CARTOON','TV') ";
        st.executeUpdate(query1);
        query1="INSERT INTO KAMODA_DRAGON VALUES(4,'MANASA','JAVA') ";
        st.executeUpdate(query1);
        query1="INSERT INTO KAMODA_DRAGON VALUES(5,'SRI','LEAD') ";
        st.executeUpdate(query1);

        System.out.println("data Inserted");

        String s="SELECT * FROM KAMODA_DRAGON";

        ResultSet rs=st.executeQuery(s);
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }


        String f="DROP DATABASE HELLO";
        st.executeUpdate(f);
        System.out.println("Database droped.. ");


        rs.close();
        st.close();
        cn.close();



    }

}
