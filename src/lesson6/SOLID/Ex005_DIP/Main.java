package lesson6.SOLID.Ex005_DIP;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(new ConsoleView());
        book1.viewAuthor();
        book1.viewTitle();
        book1.viewCurrentPage();

        System.out.println();

        Book book2 = new Book(new WindowView());
        book2.viewTitle();
        book2.turnPage(10);
        book2.viewCurrentPage();
    }
}
