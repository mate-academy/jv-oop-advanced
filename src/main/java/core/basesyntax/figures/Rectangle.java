package core.basesyntax.figures;

import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, Color color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        super.setColor(color);
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq.units, first side: " + getFirstSide()
                + " units, second side: " + getSecondSide()
                + " units, color: " + getColor());
    }
}
