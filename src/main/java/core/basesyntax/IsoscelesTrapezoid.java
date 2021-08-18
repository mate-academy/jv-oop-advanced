package main.java.core.basesyntax;

import java.awt.*;

public class IsoscelesTrapezoid extends Figure {
    double baseA;
    double baseB;
    double height;

    public IsoscelesTrapezoid (String color, double baseA, double baseB, double height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseA + baseB) * height;
    }

    @Override
    public String drawTheFigure() {
        return  "Figure: isosceles trapezoid, area: " + getArea() + " sq.units, base a: "
                + baseA + " units, " + "base b: " + baseB + " units, color: " + getColor();
    }
}
