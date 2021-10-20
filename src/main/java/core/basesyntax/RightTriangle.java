package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, String name, double firstLeg, double secondLeg) {
        super(color, name);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return "Figure: " + getName().toLowerCase() + ", area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + getColor();
    }
}
