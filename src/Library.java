import java.util.ArrayList;

/**
 * Created by Андрей on 05.09.2016.
 */
public class Library {

    ArrayList<Item> libraryList = new ArrayList<Item>();

    public Library() {


    }

    public void addItem(Item item) {

        libraryList.add(item);
    }

    public void deleteItem(Item item) {

        libraryList.remove(item);
    }

    public void checkList() {

        for (Item item : libraryList) {
            System.out.println(item.getName());
        }

    }

    public void checkBooksList() {

        for (Item item : libraryList) {
            
            if(item instanceof Book){

                System.out.println(item.getName());
            }

        }

    }
    public void checkMagazineList() {

        for (Item item : libraryList) {

            if(item instanceof Magazine){

                System.out.println(item.getName());
            }

        }

    }
    public void checkComicBookList() {

        for (Item item : libraryList) {

            if(item instanceof ComicBook){

                System.out.println(item.getName());
            }

        }

    }
    public Item findItemId(int id) {

        Item result = null;

        for (Item item : libraryList) {

            if(item.getId() == id){

                result = item;
            }

        }
        if(result == null){
            System.out.println("There is no item you serching for:(");
        }

        return result;


    }
}
