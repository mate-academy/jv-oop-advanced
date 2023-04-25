package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String colorSupplier, double length, double width) {
        super(colorSupplier);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: "
                    + String.format("%.2f", getArea())
                    + " sq.units, firstSide: "
                    + String.format("%.2f", length)
                    + " units, secondSide: "
                    + String.format("%.2f", width)
                    + " units, color: " + getColor());
    }
}
