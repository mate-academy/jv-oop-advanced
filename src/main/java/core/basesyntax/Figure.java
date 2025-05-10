package core.basesyntax;

public class Figure implements Drawing, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
    }

    @Override
    public double getArea() {
        return 0;
    }
}
