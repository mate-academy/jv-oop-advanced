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
    public String draw() {
        return "Figure: rectangle,"
                + " area: " + this.getArea() + " sq.units, "
                + "height: " + this.getHeight() + " units, "
                + "width: " + this.getWidth() + " units, "
                + "color: " + this.getColor();
    }
}
