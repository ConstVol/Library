import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Андрей on 05.09.2016.
 */
public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        RandomG randomG = new RandomG();

        Book hr = new Book("HR managment", 1999, "roJloBKa l7puHL|a", 13666, 666 );

        Magazine times = new Magazine("!HR managment", 1999, "!roJloBKa l7puHL|a", 13066, "A");

        ComicBook batman = new ComicBook("BATMAN", 1999, "!roJloBKa l7puHL|a", 13006, "DC");

        randomG.randomyze(library);
        library.checkList();








    }
    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/sqlite/db/chinook.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

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
    }
}
