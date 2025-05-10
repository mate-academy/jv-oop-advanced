package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + areaCalculator()
                + " sq. units, width: " + width + " units, height: "
                + height + " units, color: " + getColor());
    }

    @Override
    public double areaCalculator() {
        return width * height;
    }
}
