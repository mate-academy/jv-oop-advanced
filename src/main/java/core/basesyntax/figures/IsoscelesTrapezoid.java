package core.basesyntax.figures;

import core.basesyntax.Figure;
import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    public static final int BOUND = 100;
    private int firstSide;
    private int secondSide;
    private int height;

    @Override
    public void setRandomProperties() {
        super.setRandomProperties();
        this.firstSide = new Random().nextInt(BOUND);
        this.secondSide = new Random().nextInt(BOUND);
        this.height = new Random().nextInt(BOUND);
    }

    @Override
    public double getArea() {
        return height * ((firstSide + secondSide) / 2);
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide
                + " units, height: " + height
                + " units, color: " + getColor();
    }
}
