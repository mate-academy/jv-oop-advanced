package model.figure;

import model.Figure;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        print();
    }

    @Override
    public int calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void print() {
        System.out.println("Figure: Rectangle, area:  " + calculateArea()
                + " sq. units, first side: " + firstSide + "first side: "
                + secondSide + " units, color: " + color);
    }
}
