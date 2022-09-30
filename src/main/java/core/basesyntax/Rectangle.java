package core.basesyntax;

public class Rectangle implements Figure {
    private final String color;
    private final int base;
    private final int height;

    public Rectangle(String color, int base, int height) {
        this.color = color;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure: rectangle,"
                + " area: " + getArea() + " sq.units,"
                + " base: " + base + " units,"
                + " height: " + height + " units,"
                + " color: " + getColor().toLowerCase();
    }
}
