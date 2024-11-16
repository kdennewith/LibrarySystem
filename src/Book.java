public class Book {
    private String title;
    private String author;
    private int pulicationYear;
    private String IsbnNumber;
    private String callNumber;

    public Book(String title, String author, int pulicationYear, String isbnNumber, String callNumber) {
        this.title = title;
        this.author = author;
        this.pulicationYear = pulicationYear;
        this.IsbnNumber = isbnNumber;
        this.callNumber = callNumber;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPulicationYear() {
        return pulicationYear;
    }

    public void setPulicationYear(int pulicationYear) {
        this.pulicationYear = pulicationYear;
    }

    public String getIsbnNumber() {
        return IsbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        IsbnNumber = isbnNumber;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }
}
