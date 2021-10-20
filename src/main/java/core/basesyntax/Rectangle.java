package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private double length;
    private double width;

    public Rectangle(String color, String name, double length, double width) {
        super(color, name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String draw() {
        return "Figure: " + getName().toLowerCase() + ", area: " + getArea() + " sq.units, length: "
                + length + " units, width: " + width + " units, color: " + getColor();
    }
}
