public class Main {
    public static void main(String[] args) {

        Author author = new Author("Вальтер" , "Скотт");
        Book nameBook = new Book(author, "Айвенго", 1829);

        Author author1 = new Author("Михаил", "Лермонтов");
        Book nameBook1 = new Book(author, "Парус", 1841);

        Author author2 = new Author("Александр", "Пушкин");
        Book nameBook2 = new Book(author2, "Капитанская дочка", 1836);

        System.out.println(nameBook);
        System.out.println(nameBook1);
        System.out.println(nameBook2);
    }
}