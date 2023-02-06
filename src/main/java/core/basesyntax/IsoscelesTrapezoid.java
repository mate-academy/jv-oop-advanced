package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upSide = SIDE;
    private final double downSide = SIDE;
    private final double height = SIDE;

    public Color getColor() {
        return color;
    }

    @Override
    public double area() {
        return ((upSide + downSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + this.area() + " sq.units, up side: "
                + getUpSide() + " units, down side: " + getDownSide() + " units, height: "
                + getHeight() + " units, color: " + getColor());
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
