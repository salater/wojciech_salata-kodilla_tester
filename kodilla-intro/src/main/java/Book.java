public class Book {

    private String author;
    private String title;
    private int numberOfPage;

    public Book(String author, String title, int numberOfPage) {
        this.author = author;
        this.title = title;
        this.numberOfPage = numberOfPage;

    }
    public static Book of(String author, String title, int numberOfPage) {
        Book ksiazka = new Book(author, title, numberOfPage);
        return ksiazka;
    }
    public static void main(String[] args) {

        Book ksiazka = Book.of("Sapkowski", "Wiedźmin ", 355);
        Book encyklopedia = Book.of("Kotek", "Od A-z ", 843);
        System.out.println("Moje ksiazki to : " + ksiazka.author + " " + ksiazka.title + ksiazka.numberOfPage);
        System.out.println("Moje ksiazki to : " + encyklopedia.author + " " + encyklopedia.title + encyklopedia.numberOfPage);

    }
}