import java.sql.*;

/**
 * Created by Андрей on 08.09.2016.
 */
public class DBConnector {

    private static Connection conn;

    public static Connection connect() {

        try {// create a database connection
            // db parameters
            String url = "jdbc:sqlite:E:\\test.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("DBConnector to SQLite has been established.");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
    public static void printDb(Connection x){



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
        try {
            x.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public static void addItem(Item x, Connection y){

        try {
            Statement statement = y.createStatement();

            statement.executeUpdate("insert into books values(" + " ' " +
                    x.getName()+" ', ' "+x.getAuthor()+" ', ' ', 0 , ' '  );");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}