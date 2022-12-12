package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height * 2 + this.width * 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle,"
                + " area: " + getArea() + " sq.units, "
                + "height: " + height + " units, "
                + "width: " + width + " units, "
                + "color: " + getColor());
    }
}
