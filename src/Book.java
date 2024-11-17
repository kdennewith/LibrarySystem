public class Book extends Library{
    private String title;
    private String author;
    private int publicationYear;
    private String IsbnNumber;
    private String callNumber;

    /**
     * This constructor will be used for storing books. We search for books using the callNumber since all are unique,
     *  I read that ISBN numbers could be shared between book editions so that wouldn't work.
     * @param title Title of book
     * @param author Author of the book
     * @param publicationYear Year the book was published
     * @param isbnNumber Found on the lower portion of book above the barcode, a code given to every book, except reprints.
     * @param callNumber Used to find books at certain locations in the library, found on spine it's an organization code.
     */
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
