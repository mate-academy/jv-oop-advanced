package core.basesyntax.entity;

import core.basesyntax.Figure;
import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid() {
        this.sideA = new Random().nextInt(MAX_VALUE);
        this.sideB = new Random().nextInt(MAX_VALUE);
        this.height = new Random().nextInt(MAX_VALUE);
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public String drawFigure() {
        return "Figure: circle, area: " + getArea() + " sq.units, side A: "
                + sideA + " units, side B:" + sideB + " units, height: "
                + height + " units, color: " + color;
    }
}

