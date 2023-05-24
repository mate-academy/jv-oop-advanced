package core.basesyntax;

public class Figure implements AreaCalculator {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("color: " + color);
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
