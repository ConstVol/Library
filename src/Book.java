/**
 * Created by Андрей on 05.09.2016.
 */
public class Book extends Item {

    private int nPages;

    public int getnPages() {
        return nPages;
    }

    public void setnPages(int nPages) {
        this.nPages = nPages;
    }

    public Book(String name, int year, String author, int id, int nPages) {

        super(name, year, author, id);

        this.nPages = nPages;
    }
}
