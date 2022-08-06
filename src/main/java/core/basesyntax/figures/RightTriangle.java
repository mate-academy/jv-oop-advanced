package core.basesyntax.figures;

import java.util.Random;
import suppliers.ColorSupplier;

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
    public String getInfo() {
        return "Figure: " + getFigureName() + ", "
                + "area: " + getArea() + " sq.units, base: " + getBase()
                + ", leg: " + getLeg() + ", color: " + getColor();
    }

    public RightTriangle setRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFigureName("rectangle");
        rightTriangle.setBase(random.nextDouble() + 1);
        rightTriangle.setLeg(random.nextDouble() + 1);
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }
}
