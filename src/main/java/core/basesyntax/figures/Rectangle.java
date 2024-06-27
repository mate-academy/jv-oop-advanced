package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.setColor(color);
        this.setType("rectangle");
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getInfo() {
        return "Figure: "
                + getType() + ", "
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
                + getColor();
    }
}
