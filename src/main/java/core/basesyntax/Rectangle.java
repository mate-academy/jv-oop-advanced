package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double length;

    public Rectangle(String color, double height, double length) {
        super(color);
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {
        return height * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, height: "
                + height + " units, length: " + length + " units, color: " + getColor());
    }
}
