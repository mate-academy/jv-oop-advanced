package core.basesyntax.figure;

import core.basesyntax.behaviour.Figure;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super.setColor(color);
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override

    public double getArea() {
        return 2 * width + 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, "
                + "area: " + this.getArea() + " sq.units, "
                + "width: " + this.width + " units, "
                + "height: " + this.height + " units, "
                + "color: " + super.getColor());
    }
}
