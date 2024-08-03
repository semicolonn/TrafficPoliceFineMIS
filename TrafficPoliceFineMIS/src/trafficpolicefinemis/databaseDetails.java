package trafficpolicefinemis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DE LL
 */
public class databaseDetails {

    public databaseDetails() {
    }
    public static Connection conDB() {
        try {
            String db_name = "tpfmis";
            String user = "root";
            String password = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + db_name + "?useUnicode=true&characterEncoding=UTF-8", user, password);


        //System.out.println("Connection built!");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Database details: Error in database connection! ");

            System.err.println("Database details: Error in database connection! " + ex.getMessage());
            return null;
        }
    }

}
