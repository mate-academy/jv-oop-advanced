package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {

    private double base;
    private double leg;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return base * leg / 2;
    }

    @Override
    public String info() {
        setFigureName("rectangle");
        setBase(random.nextDouble() + 1);
        setLeg(random.nextDouble() + 1);
        setColor(colorSupplier.getRandomColor());
        return "Figure: " + getFigureName() + ", "
                + "area: " + getArea() + " sq.units, base: " + getBase()
                + ", leg: " + getLeg() + ", color: " + getColor();
    }
}
