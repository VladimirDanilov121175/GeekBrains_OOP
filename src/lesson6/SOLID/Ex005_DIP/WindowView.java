package lesson6.SOLID.Ex005_DIP;

public class WindowView implements View {
    @Override
    public void print(String text) {
        String result = String.format("Window view: %s", text);
        System.out.println(result);
    }
}
