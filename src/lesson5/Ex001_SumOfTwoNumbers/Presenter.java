package lesson5.Ex001_SumOfTwoNumbers;

public class Presenter {
    Model model;
    View view;

    public Presenter(Model m, View v) {
        this.model = m;
        this.view = v;
    }

    public void buttonClick() {
        System.out.println("Enter two numbers");

        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);

        int result = model.result();
        view.print("Sum: ", result);
    }
}
