package core.basesyntax.model;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int side;

    @Override
    public double getArea() {
        return ((double) firstBase + secondBase) / 4
                * Math.sqrt(4 * side * side - Math.pow(firstBase - secondBase, 2));
    }

    @Override
    public void setRandomParameters() {
        super.setRandomParameters();
        this.firstBase = new Random().nextInt(100);
        this.secondBase = new Random().nextInt(100);
        this.side = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea() + " sq.units, firstBase:"
                + firstBase + " units, secondBase: "
                + secondBase + " units, side: "
                + side + " units, colour: " + getColor();
    }
}
