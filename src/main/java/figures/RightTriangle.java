package figures;

import behavior.ColorSupplier;
import behavior.Figure;
import behavior.GetAreaAble;

public class RightTriangle extends Figure implements GetAreaAble {
    private final double sideLeft;
    private final double sideRight;
    private final double baseOfRectangle;
    private final String name = "Right Triangle";

    private ColorSupplier colorSupplier = new ColorSupplier();

    public RightTriangle(double sideLeft, double sideRight, double baseOfRectangle) {
        this.sideLeft = sideLeft;
        this.sideRight = sideRight;
        this.baseOfRectangle = baseOfRectangle;
    }

    @Override
    public double getArea() {
        return (baseOfRectangle / 2)
                * (Math.sqrt((sideLeft * sideLeft)
                - ((sideRight * sideRight) / 4)));
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, sideLeft: "
                + sideLeft + " units, sideRight: " + sideRight + " units, base: "
                + baseOfRectangle + " units, color: " + colorSupplier.getRandomColor();
    }
}
