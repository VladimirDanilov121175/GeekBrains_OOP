package lesson6.SOLID.Ex005_DIP;

public class Book {

    View view;
    int indexPage;


    // Гибкий конструктор, позволяющий принимать любую из двух вьюшек - консольную и оконную - благодаря тому, что
    // обе вьюшки реализуют единый интерфейс View
    public Book(View view) {
        this.view = view;
        this.indexPage = 1;
    }

    // Нижеследующие методы не зависят от того, какая из двух вьюшек будет применяться к данной книге, так как
    // обе вьюшки реализуют единый метод print() благодаря единому интерфейсу View

    public void viewAuthor() {
        view.print("Author of this book");
    }

    public void viewTitle() {
        view.print("Title of this book");
    }

    public void turnPage(int page) {
        if (page >=1 && page <= 300) {
            this.indexPage = page;
        }
        else view.print("The end");
    }

    public void viewCurrentPage(){
        view.print(String.format("Page no.%d", this.indexPage));
    }

}
