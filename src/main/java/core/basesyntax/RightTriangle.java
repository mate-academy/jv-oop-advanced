package core.basesyntax;

import model.Figure;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        print();
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void print() {
        System.out.println("Figure: Circle, area:  " + calculateArea()
                + " sq. units, first leg: " + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + color);
    }
}
