package core.basesyntax;

public class Rectangle extends Figure {
    private double rectangleHeight;
    private double width;

    public Rectangle(String color, double rectangleHeight, double width) {
        super(color);
        this.rectangleHeight = rectangleHeight;
        this.width = width;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("rectangle,"
                + " area: " + getArea()
                + " sq.units,"
                + " rectangleHeight: "
                + rectangleHeight + " sq.units, "
                + " width: "
                + width + " sq.units, "
                + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return rectangleHeight * width;
    }
}
