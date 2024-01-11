package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract String toString();

    @Override
    public double calculateArea() {
        return 0;
    }
}
