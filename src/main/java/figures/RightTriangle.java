package figures;

import behavior.Figure;

public class RightTriangle extends Figure {
    private final double sideLeft;
    private final double sideRight;
    private final double baseOfRectangle;

    public RightTriangle(String color, String name, double sideLeft,
                         double sideRight, double baseOfRectangle) {
        super(color, name);
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
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq.units, sideLeft: "
                + sideLeft + " units, sideRight: " + sideRight + " units, base: "
                + baseOfRectangle + " units, color: " + getColor());
    }
}
