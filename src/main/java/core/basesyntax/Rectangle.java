package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

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
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(("Figure: " + "rectangle, " + "area: "
                + getArea() + " sq.units, " + "width: "
                + width + " units, " + "height: "
                + height + " units, " + "color: " + getColor()));
    }
}
