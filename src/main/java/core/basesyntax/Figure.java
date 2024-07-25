package core.basesyntax;

public abstract class Figure implements AreaCalculator, AttributesDrawing {
    private final String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public void draw() {
    }
}
