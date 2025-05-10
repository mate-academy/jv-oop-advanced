package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
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
        return this.height * this.width;
    }

    @Override
    public void printInfoFigure() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units,"
                + " width: " + getWidth() + " units,"
                + " height: " + getHeight() + " units,"
                + " color: " + getColor());
    }
}
