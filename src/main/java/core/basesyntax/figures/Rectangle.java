package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final int length;
    private final int weight;

    public Rectangle(String color, int length, int weight) {
        super(color);
        this.length = length;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public double getArea() {
        return getLength() * getWeight();
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.unit, length: "
                + getLength() + " units, weight: " + getWeight()
                + " units, color: " + getColor());
    }
}
