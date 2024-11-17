public class DVD extends Library{
    private String title;
    private int year;
    private String callNumber;
    private boolean checkedOut;

    public DVD(String title, int year, String callNumber) {
        this.title = title;
        this.year = year;
        this.callNumber = callNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public boolean getCheckedOut() {
        return checkedOut;
    }
}
