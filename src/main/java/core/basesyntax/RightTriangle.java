package core.basesyntax;

import core.basesyntax.interfaces.Calculatable;
import core.basesyntax.interfaces.Drawable;

public class RightTriangle extends Figure implements Calculatable, Drawable {
    private double baseLength;
    private double height;

    public RightTriangle(String name, Enum color, double baseLength, double height) {
        super(name, color);
        this.baseLength = baseLength;
        this.height = height;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return baseLength * height / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", " + "area: "
                + String.format("%.2f", getArea()) + " sq. units, "
                + "base length: " + String.format("%.2f", baseLength)
                + " height: " + String.format("%.2f", height)
                + " units, " + "color: " + getColor());
    }
}
