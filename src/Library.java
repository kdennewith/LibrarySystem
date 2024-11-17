import java.util.ArrayList;
import java.util.List;

public class Library {

    /*
     * Adding to the Library:
     *
     * To add something new to the Library, create a new Class Object.
     */
    public List<LibraryItem> items;

    public Library() {
        items = new ArrayList<LibraryItem>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void removeItem(LibraryItem item) {
        items.remove(item);
    }

    /**
     * This method goes through each item in the LibraryItem List of items to find a match of the given title.
     * @param title Title of item you are searching for.
     */
    public void searchByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equals(title)) {
                item.displayInfo();
                return;
            }
        }
        System.out.println("Nothing with that title could be found.");
    }

    public void searchByCallNumber(String callNumber) {
        for (LibraryItem item : items) {
            if (item.getCallNumber().equals(callNumber)) {
                item.displayInfo();
                return;
            }
        }
        System.out.println("Nothing with that call number could be found.");
    }

    /**
     * This method handles checking out an item from the library using the unique callNumber. Goes through the
     *  list of items and sets an item's checkOut status to true if the callNumber given is equal to a callNumber
     *  that is stored in the LibraryItem list.
     * @param callNumber callNumber of book you want to check out.
     */
    public void checkOutItem(String callNumber) {
        for(LibraryItem item : items) {
            if(item.getCallNumber().equals(callNumber) && !item.isCheckedOut()) {
                item.checkOut();
                return;
            }
        }
        System.out.println("Nothing with that call number could be found.");
    }

    public void returnItem(String callNumber) {
        for(LibraryItem item : items) {
            if(item.getCallNumber().equals(callNumber) && item.isCheckedOut()) {
                item.checkIn();
                return;
            }
        }
        System.out.println("Nothing with that call number could be found.");
    }


}
