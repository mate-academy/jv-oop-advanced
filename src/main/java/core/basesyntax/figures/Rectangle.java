package core.basesyntax.figures;

import core.basesyntax.Figure;
import java.util.Random;

public class Rectangle extends Figure {
    public static final int BOUND = 100;
    private int width;
    private int height;

    @Override
    public void setRandomProperties() {
        super.setRandomProperties();
        this.width = new Random().nextInt(BOUND);
        this.height = new Random().nextInt(BOUND);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea()
                + " sq.units, width: " + width
                + " units, height: " + height
                + " units, color: " + getColor();
    }
}
