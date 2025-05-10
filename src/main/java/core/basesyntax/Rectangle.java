package core.basesyntax;

public class Rectangle extends Figure {
    private double shortSide;
    private double longSide;

    public Rectangle(String color, double shortSide, double longSide) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    @Override
    public double getArea() {
        return shortSide * longSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, "
                + "area: " + String.format("%.2f", getArea()) + " sq.units, "
                + "shortSide: " + shortSide + " units, "
                + "longSide: " + longSide + " units, "
                + "color: " + getColor() + ".");
    }
}
