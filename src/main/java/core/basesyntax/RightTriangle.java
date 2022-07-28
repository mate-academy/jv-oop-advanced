package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
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

    public double calculateArea() {
        double area = (getFirstLeg() * getSecondLeg()) / 2;
        return Math.floor(area * 100) / 100.0;
    }

    public void display() {
        System.out.println("Figure: right triangle," + " area: "
                + calculateArea() + " sq.units," + " firstLeg: "
                + getFirstLeg() + " units," + " secondLeg: "
                + getSecondLeg() + " units," + " color: " + getColor());
    }
}
