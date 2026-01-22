package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private double width;

    public Rectangle(String color, String name, double length, double width) {
        this.setColor(color);
        this.setName(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, length: " + length + " units, width: " + width
                + " units, color: " + getColor());
    }
}
