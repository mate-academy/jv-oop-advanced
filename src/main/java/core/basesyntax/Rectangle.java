package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double weight;

    public Rectangle(Color color, double length, double weight) {
        super(color);
        this.length = length;
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + AreaCalculator()
                + " sq.units, firstLeg: " + getLength()
                + ", secondLeg: " + getWeight() + ", color: " + getColor());
    }

    @Override
    public double AreaCalculator() {
        return length * weight;
    }
}
