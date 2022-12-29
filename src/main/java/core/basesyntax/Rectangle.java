package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    Rectangle(double width, double height, Colors color) {
        super("Rectangle", color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return getFigureInfo()
                + String.format(", width: %.1f units, height: %.1f units", width, height);
    }
}
