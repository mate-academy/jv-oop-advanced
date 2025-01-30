package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, height: " + height
                + ", width: " + width
                + ", color: " + getColor());
    }
}
