package core.basesyntax;

import model.Figure;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        print();
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void print() {
        System.out.println("Figure: Rectangle, area:  " + calculateArea()
                + " sq. units, first side: " + firstSide + " second side: "
                + secondSide + " units, color: " + color);
    }
}
