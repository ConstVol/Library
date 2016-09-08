import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Андрей on 08.09.2016.
 */
public class DBConnector {

    private static java.sql.Connection conn;

    public static java.sql.Connection connect() {
        java.sql.Connection conn = null;
        try {// create a database connection
            // db parameters
            String url = "jdbc:sqlite:test.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("DBConnector to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }
    public static void printDb(java.sql.Connection x){



        try
        {
            // create a database connection

            Statement statement = x.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.


            ResultSet rs = statement.executeQuery("select * from books");
            while(rs.next())
            {
                // read the result set
                System.out.println("title = " + rs.getString("title"));

            }
        }
        catch(SQLException e)
        {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        }
        finally
        {
            try
            {
                if(x != null)
                    x.close();
            }
            catch(SQLException e)
            {
                // connection close failed.
                System.err.println(e);
            }
        }


    }
}