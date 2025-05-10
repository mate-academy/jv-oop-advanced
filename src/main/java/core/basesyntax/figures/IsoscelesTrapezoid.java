package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double upSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(String colorSupplier, double upSide, double downSide, double height) {
        super(colorSupplier);
        this.upSide = upSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upSide + downSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                    + String.format("%.2f", getArea()) + " sq.units, height: "
                    + String.format("%.2f", height)
                    + " units, upSide: " + String.format("%.2f", upSide)
                    + " units, downSide: " + String.format("%.2f", downSide)
                    + " color: " + getColor());
    }
}
