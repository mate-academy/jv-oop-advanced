package core.basesyntax.model;

import java.util.Random;

public class Square extends Figure {
    private int side;

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void setRandomParameters() {
        super.setRandomParameters();
        this.side = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea() + " sq.units, side = "
                + side + " units, colour: " + getColor();
    }
}
