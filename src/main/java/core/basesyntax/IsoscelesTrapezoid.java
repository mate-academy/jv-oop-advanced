package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int sideLeft;
    private final int sideRight;
    private final int height;

    public IsoscelesTrapezoid(int sideLeft, int sideRight, int height, String color) {
        this.sideLeft = sideLeft;
        this.sideRight = sideRight;
        this.height = height;
        setColor(color);
    }

    @Override
    public void print() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, side left: "
                + sideLeft + ", side right: " + sideRight + " ,height: " + height + " units, color:"
                + getColor());
    }

    @Override
    public double getArea() {
        return ((sideLeft * sideRight) / 2) * height;
    }
}
