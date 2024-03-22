package core.basesyntax;

public class Figure implements Drawable, AreaCalculator {
    protected static final double ROUNDING_PRECISION = 10.0;
    protected static final int DEFAULT_LENGTH = 10;
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {
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
