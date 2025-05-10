package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upSide;
    private final double downSide;
    private final double height;

    public IsoscelesTrapezoid(double upSide, double downSide, double height, String color) {
        this.upSide = upSide;
        this.downSide = downSide;
        this.height = height;
        super.color = color;
    }

    @Override
    public double calculateArea() {
        return (upSide + downSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + this.calculateArea()
                + " sq.units, up side: " + getUpSide() + " units, down side: "
                + getDownSide() + " units, height: " + getHeight() + " units, color: "
                + getColor());
    }

    public double getUpSide() {
        return upSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public double getHeight() {
        return height;
    }
}
