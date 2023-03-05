package lesson5.Ex001_SumOfTwoNumbers;

public class Program {
    public static void main(String[] args) {
        Model model = new SumModel();
        View view = new View();
        Presenter presenter = new Presenter(model, view);

        presenter.buttonClick();
        presenter.buttonClick();
        presenter.buttonClick();

    }
}
