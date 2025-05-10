package core.basesyntax;

public class Rectangle extends Figure {
    private final int base;
    private final int height;

    public Rectangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    public String draw() {
        return "Figure: rectangle,"
                + " area: " + getArea() + " sq.units,"
                + " base: " + base + " units,"
                + " height: " + height + " units,"
                + " color: " + getColor().toLowerCase();
    }
}
