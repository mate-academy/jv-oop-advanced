package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;
    private String color;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, length: "
                + height + " units, width: " + width + " units, color: " + color);
    }
}
