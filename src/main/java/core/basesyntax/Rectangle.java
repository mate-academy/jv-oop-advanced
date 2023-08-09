package core.basesyntax;

public class Rectangle extends Figure {
    private double shortSide;
    private double longSide;

    public Rectangle(double shortSide, double longSide, String color) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    public double getArea() {
        return shortSide * longSide;
    }

    public String printInfo() {
        return "Figure: rectangle, "
             + "area: " + this.getArea() + " sq.units, "
             + "shortSide: " + shortSide + " units, "
             + "longSide: " + longSide + " units, "
             + "color: " + this.getColor();
    }
}
