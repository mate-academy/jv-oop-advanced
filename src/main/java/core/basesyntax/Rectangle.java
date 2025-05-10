package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq. units, width " + width
                + " units, height " + height
                + " units, color: " + getColor());
    }
}
