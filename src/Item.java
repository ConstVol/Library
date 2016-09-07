/**
 * Created by Андрей on 05.09.2016.
 */
public class Item {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    private String name;

    private int year;

    private String author;

    public Item(String name, int year, String author, int id) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
