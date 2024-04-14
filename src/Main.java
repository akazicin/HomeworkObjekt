public class Main {
    public static void main(String[] args) {

        Author author = new Author("Вальтер" , "Скотт");
        Book book = new Book(author, "Айвенго", 1829);

        Author author1 = new Author("Михаил", "Лермонтов");
        Book book1 = new Book(author, "Парус", 1841);

        System.out.println(book1);
        System.out.println(book);
    }
}