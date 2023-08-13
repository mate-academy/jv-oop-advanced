package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return (double) height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure, rectangle, " + "area: " + getArea() + " sq.units, "
                + "height: " + height + " units, "
                + "width: " + width + " units, "
                + "color: " + getColor());
    }
}
