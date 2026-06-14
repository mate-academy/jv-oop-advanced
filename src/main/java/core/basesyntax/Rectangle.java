package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double rectangleHeight;

    public Rectangle(String color, double width, double rectangleHeight) {
        super(color);
        this.width = width;
        this.rectangleHeight = rectangleHeight;
    }

    @Override
    public double getArea() {
        return width * rectangleHeight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + String.format("%.1f", getArea())
                + " sq. units, width: " + (int) width
                + " units, rectangle Height: " + (int) rectangleHeight
                + " units, color: " + getColor().toLowerCase());
    }
}
