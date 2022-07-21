package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;
    private Random random = new Random();

    public Rectangle(double firstSide, double secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + getArea()
                + " sq.units, first side: "
                + firstSide
                + " units, second side: "
                + secondSide
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
