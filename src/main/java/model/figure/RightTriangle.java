package model.figure;

import model.Figure;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        print();
    }

    @Override
    public int calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void print() {
        System.out.println("Figure: Circle, area:  " + calculateArea()
                + " sq. units, first leg: " + firstLeg + " sq. units, second leg: "
                + secondLeg + " units, color: " + color);
    }
}
