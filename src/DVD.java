public class DVD extends LibraryItem{
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int year;


    public DVD(String title, int year, String callNumber) {
        super(title,callNumber);
        this.year = year;

    }

    @Override
    public void displayInfo() {
        System.out.println("DVD: " + getTitle() + " (Release Date: " + year + ")");
    }
}
