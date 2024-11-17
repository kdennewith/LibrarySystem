public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String IsbnNumber;
    private String callNumber;

    public Book(String title, String author, int publicationYear, String isbnNumber, String callNumber) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
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
