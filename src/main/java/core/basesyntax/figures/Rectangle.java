package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private static final String type = "rectangle";
    private final int width;
    private final int height;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) width * height;
    }

    @Override
    public String getInfo() {
        return "Figure: "
                + type + ", "
                + "area: "
                + this.getArea()
                + " sq. units, "
                + "width: "
                + width
                + " units, "
                + "height: "
                + height
                + " units, "
                + "color: "
                + color;
    }
}
