/**
 * Created by Андрей on 05.09.2016.
 */
public class ComicBook extends Item {

    private String pHouse;

    public String getpHouse() {
        return pHouse;
    }

    public void setpHouse(String pHouse) {
        this.pHouse = pHouse;
    }

    public ComicBook(String name, int year, String author, int id, String pHouse) {

        super(name, year, author, id);

        this.pHouse = pHouse;

    }
}
