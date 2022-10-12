package core.basesyntax.figures;

import core.basesyntax.AreaCalculation;
import core.basesyntax.Figure;

public class Rectangle extends Figure implements AreaCalculation {

    private final int width;
    private final int height;

    public Rectangle(String color, String name, int width, int height) {
        super(color, name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String printInfo() {
        return super.printInfo()
                + " width: "
                + width
                + " units"
                + " weight: "
                + height
                + " units";
    }
}
