package core.basesyntax;

public class Rectangle extends Figure {
    private double longSide;
    private double shortSide;

    public Rectangle(double longSide, double shortSide, String color) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    public double getLength() {
        return longSide;
    }

    public void setLength(double longSide) {
        this.longSide = longSide;
    }

    public double getShortSide() {
        return shortSide;
    }

    public void setShortSide(double shortSide) {
        this.shortSide = shortSide;
    }

    @Override
    public double getArea() {
        return longSide * shortSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + String.format("%.1f", getArea())
                + " sq. units, length: " + String.format("%.1f", longSide)
                + " units, height: " + String.format("%.1f", shortSide)
                + " units, color: " + getColor());
    }
}
