package vikidongare;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {

   // private static Connection conn = null;

    public static Connection getConnection() throws SQLException {
        //if(conn==null){
        	//ResourceBundle bundle=ResourceBundle.getBundle("com/vikidongare/dbConfig");
        	Connection con = DriverManager.getConnection(
        			"jdbc:mysql://localhost:3306/demo", "root", "");
//            ResourceBundle bundle = ResourceBundle.getBundle("com/vikidongare/dbConfig");
//            String dc = bundle.getString("driverClass");
//            String url = bundle.getString("url");
//            String username = bundle.getString("username");
//            String password = bundle.getString("password");
			return con;

           // conn = DriverManager.getConnection(url, username, password);
      //  }
       // return conn;
    }
}
