package core.basesyntax;

public class Figure implements Calc {
    private Colors color;

    public Figure(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
