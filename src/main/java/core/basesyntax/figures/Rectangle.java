package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + this.getClass().getSimpleName().toLowerCase() + ", "
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
                + getColor());
    }
}
