public class Book extends LibraryItem{
    private String author;
    private int publicationYear;
    private String IsbnNumber;

    /**
     * This constructor will be used for storing books. We search for books using the callNumber since all are unique,
     *  I read that ISBN numbers could be shared between book editions so that wouldn't work.
     * @param author Author of the book
     * @param publicationYear Year the book was published
     * @param isbnNumber Found on the lower portion of book above the barcode, a code given to every book, except reprints.
     */
    public Book(String title, String author, int publicationYear, String isbnNumber, String callNumber) {
        super(title,callNumber);
        this.author = author;
        this.publicationYear = publicationYear;
        this.IsbnNumber = isbnNumber;

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

    @Override
    public void displayInfo() {
        System.out.println("Book: " + getTitle() + "\n Author: " + author + "\n (ISBN: " + IsbnNumber + ")");
    }
}
