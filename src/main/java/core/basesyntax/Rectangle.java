package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private final int length;
    private final int weight;

    public Rectangle(String color, int length, int weight) {
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
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, length: "
                + getLength() + " units, weight: " + getWeight() + " units, color: " + getColor());
    }
}
