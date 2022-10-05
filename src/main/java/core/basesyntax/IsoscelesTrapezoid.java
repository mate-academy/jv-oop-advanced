package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(String color, double upSide, double downSide, double height) {
        super(color);
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
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq.units, up side: " + upSide + " units, down side "
                + downSide + " units, height: " + height
                + " units, color: " + getColor());
    }
}
