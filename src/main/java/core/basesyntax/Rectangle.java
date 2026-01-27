package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private double width;
    private double rectangleHeight;

    public Rectangle(double width, double height) {
        this.width = width;
        this.rectangleHeight = height;
    }

    @Override
    public double getArea() {
        return width * rectangleHeight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + ", width: "
                + width
                + ", height: "
                + rectangleHeight
                + ", color: "
                + getColor());
    }
}
