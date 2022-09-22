package core.basesyntax.figures;

import core.basesyntax.Figure;
import java.util.Random;

public class Square extends Figure {
    private int side;

    @Override
    public void setRandomProperties() {
        super.setRandomProperties();
        this.side = new Random().nextInt(100);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor();
    }
}
