package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double legA;
    private double legB;

    public RightTriangle(double legA, double legB, String name, String color) {
        super(name, color);
        this.legA = legA;
        this.legB = legB;
    }

    public double getHypotenuse() {
        return Math.sqrt((legA * legA) + (legB * legB));
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", getArea: "
                + getArea() + " sq. units, hypotenuse: "
                + getHypotenuse() + " units: color " + getColor());
    }
}
