package core.basesyntax.entity;

import core.basesyntax.Figure;
import java.util.Random;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle() {
        this.sideA = new Random().nextInt(MAX_VALUE);
        this.sideB = new Random().nextInt(MAX_VALUE);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String drawFigure() {
        return "Figure: square, area: " + getArea() + " sq.units, side A: "
                + sideA + " units, side B: " + sideB + " units, color: " + super.color;
    }
}

