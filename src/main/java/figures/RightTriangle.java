package figures;

import behavior.Figure;

public class RightTriangle extends Figure {
    private double sideLeft;
    private double sideRight;
    private double baseOfRectangle;
    private String name = "Right Triangle";

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
                + baseOfRectangle + " units, color: " + getRandomColor();
    }
}
