import java.util.List;

public class Person {
    private String name;
    private int studentID;
    private List<DVD> checkedOutDVDs;
    private List<Book> checkedOutBooks;

    /**
     * This constructor will be used to check student's current checked out books using their studentID's to search
     * @param name Name of the student.
     * @param studentID Students identification number assigned by school.
     * @param checkedOutBooks List of currently checked out books
     */
    public Person(String name, int studentID, List<Book> checkedOutBooks, List<DVD> checkedOutDVDs) {
        this.name = name;
        this.studentID = studentID;
        this.checkedOutBooks = checkedOutBooks;
        this.checkedOutDVDs = checkedOutDVDs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
