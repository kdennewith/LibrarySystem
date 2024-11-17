public abstract class LibraryItem {

    private String title;
    private String callNumber;
    private boolean isCheckedOut = false;

    public LibraryItem(String title, String callNumber) {
        this.title = title;
        this.callNumber = callNumber;
    }

    /**
     * This method is checks out a book if it is not currently checked out.
     */
    public void checkOut() {
        if(!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " has been checked out");
        }else{
            System.out.println(title + " is already checked out");
        }
    }

    /**
     * Sets a LibraryItem isCheckedOut to false, in other-words isCheckedIn.
     */
    public void checkIn() {
        isCheckedOut = false;
        System.out.println(title + " has been checked in.");
    }

    public String getTitle() {
        return title;
    }

    /**
     * Returns the callNumber
     * @return items callNumber
     */
    public String getCallNumber() {
        return callNumber;
    }

    /**
     * Returns the status of a LibraryItems isCheckedOut status.
     * @return the isCheckedOut status as either false or true.
     */
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    //Make subclass for this in each new LibraryItem
    public abstract void displayInfo();

}
