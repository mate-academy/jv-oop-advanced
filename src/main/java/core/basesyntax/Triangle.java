package core.basesyntax;

public class Triangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Triangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + String.format("%.2f",getArea())
                + " sq.units, firstLeg: "
                + String.format("%.2f",getFirstLeg()) + " units, firstLeg: "
                + String.format("%.2f",getSecondLeg())
                + " units, color: " + getColor());
    }
}
