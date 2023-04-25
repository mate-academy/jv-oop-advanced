package core.basesyntax.figures;

public class Square extends Figure {
    private double longAxis;
    private double shortAxis;

    public Square(String colorSupplier, double longAxis, double shortAxis) {
        super(colorSupplier);
        this.longAxis = longAxis;
        this.shortAxis = shortAxis;
    }

    @Override
    public double getArea() {
        return Math.PI * longAxis * shortAxis;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                    + String.format("%.2f", getArea())
                    + " sq.units, shortAxis: "
                    + String.format("%.2f", shortAxis)
                    + " sq.units, longAxis: "
                    + String.format("%.2f", longAxis)
                    + " units, color: " + getColor());
    }
}
