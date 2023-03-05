package lesson5.Ex001_SumOfTwoNumbers;

public class SumModel extends CalcModel {
    @Override
    public int result() {
        return this.x + this.y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }
}
