package core.basesyntax.figure;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.DrawFigure;
import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void toDrawFigure() {
        System.out.println("Figure: rectangle, "
                + "area: " + getArea() + " sq.units, "
                + "sideA: " + sideA + " units, "
                + "sideB: " + sideB + " units, "
                + "color: " + getColor());
    }
}
