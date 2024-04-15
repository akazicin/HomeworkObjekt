public class Book {
    private final Author author;
    private String nameBook;
    private int yearRelease;


    public Book(Author author, String nameBook, int yearRelease) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearRelease = yearRelease;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearRelease() {
        return yearRelease;
    }


    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    @Override
    public String toString() {
        return author.getFirstName() + " " + author.getSecondName() + " " + nameBook + " "
                + yearRelease;
    }
}




