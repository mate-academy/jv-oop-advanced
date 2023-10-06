package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private double isoscelesTrapezoidSide;
    private double baseUp;
    private double baseDown;
    private double height;

    public IsoscelesTrapezoid(Color color, double isoscelesTrapezoidSide,
                              double baseDown, double baseUp) {
        super(color);
        this.isoscelesTrapezoidSide = isoscelesTrapezoidSide;
        this.baseDown = baseDown;
        this.baseUp = baseUp;
    }

    public double getBaseDown() {
        return baseDown;
    }

    public double getBaseUp() {
        return baseUp;
    }

    public double getHeight() {
        return Math.sqrt(getIsoscelesTrapezoidSide() * getIsoscelesTrapezoidSide()
                - ((getBaseDown() - getBaseUp()) / 2) * ((getBaseDown() - getBaseUp()) / 2));
    }

    @Override
    public double countArea() {
        return getHeight() * ((getBaseUp() + getBaseDown()) / 2);
    }

    public double getIsoscelesTrapezoidSide() {
        return isoscelesTrapezoidSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + countArea() + " sq.units, side: "
                + getIsoscelesTrapezoidSide() + " units, baseDown: "
                + getBaseDown() + " units, baseUp: "
                + getBaseUp() + " units, color: "
                + getColor());
    }
}
