package core.basesyntax;

import core.basesyntax.interfaces.Calculatable;
import core.basesyntax.interfaces.Drawable;

public class Square extends Figure implements Calculatable, Drawable {
    private double length;

    public Square(String name, Enum color, double length) {
        super(name, color);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", " + "area: "
                + String.format("%.2f", getArea()) + " sq. units, " + "side length: "
                + String.format("%.2f", length) + " units, " + "color: " + getColor());
    }
}
