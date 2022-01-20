package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: "
                + calculateArea() + " sq.units, height: "
                + getHeight() + " units, width: "
                + getWidth() + " units, color: "
                + getColor());
    }
}
