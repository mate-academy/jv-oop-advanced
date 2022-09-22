package core.basesyntax.figures;

import core.basesyntax.Figure;
import java.util.Random;

public class Rectangle extends Figure {
    private int width;
    private int height;

    @Override
    public void setRandomProperties() {
        super.setRandomProperties();
        this.width = new Random().nextInt(100);
        this.height = new Random().nextInt(100);
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
