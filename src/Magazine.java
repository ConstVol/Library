/**
 * Created by Андрей on 05.09.2016.
 */
public class Magazine extends Item {

    private String sCategory;

    public String getsCategory() {
        return sCategory;
    }

    public void setsCategory(String sCategory) {
        this.sCategory = sCategory;
    }

    public Magazine(String name, int year, String author, int id, String sCategory) {
            super(name, year, author, id);

        this.sCategory = sCategory;
    }
}
