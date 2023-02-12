package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: Rectangle, area: "
                + getArea()
                + " sq.units, height: "
                + height
                + " width: "
                + width
                + " units, color: "
                + color);
    }
}
