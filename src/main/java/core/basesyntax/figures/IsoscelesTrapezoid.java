package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.ColorSupplier;
import core.basesyntax.Figure;
import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int upSide;
    private int downSide;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(int height, int upSide, int downSide) {
        this.height = height;
        this.upSide = upSide;
        this.downSide = downSide;
    }

    public IsoscelesTrapezoid(Color color, int height, int upSide, int downSide) {
        super(color);
        this.height = height;
        this.upSide = upSide;
        this.downSide = downSide;
    }

    @Override
    public void printArea() {
        System.out.println((upSide + downSide) / 2 * height);
    }

    @Override
    public Figure getRandomParameters() {
        Random random = new Random();
        int max = Figure.MAX_VALUE_OF_PARAM;
        Color trapezoidColor = new ColorSupplier().getRandomColor();
        return new IsoscelesTrapezoid(trapezoidColor, random.nextInt(max),
                random.nextInt(max), random.nextInt(max));
    }

    @Override
    public double getArea() {
        return (upSide + downSide) / 2 * height;
    }

    @Override
    public String toString() {
        return "Figure: isoscelesTrapezoid, area: " + getArea() + " sq.units, height: "
                + height + " units, upSide: " + upSide + " units, downSide: " + downSide
                + " units, color: " + getColor();
    }
}
