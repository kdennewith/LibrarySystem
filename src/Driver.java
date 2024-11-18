public class Driver {

    public static void main(String[] args) {
        Library brooksLibrary = new Library();

        //Call Number in this context is DVD for the item, S1 for Title starting with S in row 1, copy 2.
        LibraryItem spiritedAway = new DVD("Spirited Away",2001,"DVD S1 c.2");
        LibraryItem theWayOfKings = new Book("The Way Of Kings", "Brandon Sanderson", 2010, "978-0-76-532635-5", "BOOK T4 c.1");

        brooksLibrary.addItem(spiritedAway);
        brooksLibrary.addItem(theWayOfKings);


        brooksLibrary.checkOutItem("BOOK T4 c.1");
        brooksLibrary.checkOutItem("DVD S1 c.2");

        brooksLibrary.searchByTitle("The Way Of Kings");

        System.out.println(spiritedAway.isCheckedOut() + " Status of isCheckedOut for Spirited Away");
    }
}
