package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;
    private String color;

    public Rectangle(String color, double height, double width) {
        super(color);
        getHeight();
        getWidth();
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, height: " + getHeight()
                + " units, width: " + getWidth()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return height * width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }
}
