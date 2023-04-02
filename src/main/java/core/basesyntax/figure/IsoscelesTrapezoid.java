package core.basesyntax.figure;

import core.basesyntax.Color;

public class IsoscelesTrapezoid extends Figure {
    private final double firstParallel;
    private final double secondParallel;
    private final double height;

    public IsoscelesTrapezoid(
            Color color,
            double firstParallel,
            double secondParallel,
            double height
    ) {
        this.color = color;
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    @Override
    public double area() {
        return (firstParallel + secondParallel) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + area()
                + " sq.units, first parallel: " + firstParallel
                + " units, second parallel: " + secondParallel
                + " units, height: " + height
                + " units, color: " + color.toString().toLowerCase();
    }
}
