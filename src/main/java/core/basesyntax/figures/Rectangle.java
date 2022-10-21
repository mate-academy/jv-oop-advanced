package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
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
    public String getInfo() {
        return super.getInfo()
                + " width: "
                + width
                + " units"
                + " weight: "
                + height
                + " units";
    }
}
