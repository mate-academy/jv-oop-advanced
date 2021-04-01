package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String name, String color, int firstLeg, int secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " square units, hypotenuse: " + getHypotenuse()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    public double getHypotenuse() {
        return Math.hypot(firstLeg, secondLeg);
    }
}
