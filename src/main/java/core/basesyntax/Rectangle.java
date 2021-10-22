package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int weight;

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getArea() {
        return length * weight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, length: "
                + length + " units, weight: " + weight + " units, color: " + getColor());
    }
}
