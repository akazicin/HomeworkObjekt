public class Book {
    private final Author author;
    private String book;
    private int yearRelease;


    public Book(Author author, String book, int yearRelease){
        this.author = author;
        this.book = book;
        this.yearRelease = yearRelease;
    }

    public Author getAuthor() {
        return author;
    }
    public String getBook() {
        return book;
    }

    public int getYearRelease() {
        return yearRelease;
    }


    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}

