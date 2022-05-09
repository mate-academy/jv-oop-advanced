package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String draw() {
        return "Figure: "
                + getClass().getSimpleName() + ","
                + " area: " + getArea() + " sq.units, "
                + "width: " + getWidth() + " units, "
                + "height: " + getHeight() + " units, "
                + "color: " + getColor();
    }
}
