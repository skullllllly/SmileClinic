
package DBMS;


import java.sql.*;

//the connect is here
public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException ,SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String user="root";
        String password="";
        String url="jdbc:mysql://127.0.0.1:3306/smile_clinc";
        Connection conn = (Connection) DriverManager.getConnection(url, user, password);
        Statement statement =conn.createStatement();
        
       // String query =""
      //  ResultSet result=statement.executeQuery(query);
    }

    
}
