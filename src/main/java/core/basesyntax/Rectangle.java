package core.basesyntax;

public class Rectangle extends Figure implements Shape {
    private final double length;
    private final double weight;

    public Rectangle(String color, double length, double weight) {
        super(color);
        this.length = length;
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getArea() {
        return length * weight;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, length: "
                + getLength() + " units, weight: " + getWeight() + " units, color: " + getColor());
    }
}
