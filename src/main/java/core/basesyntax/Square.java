package core.basesyntax;

import javax.swing.*;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, " + "area: " + area() + " sq. units," + " side: " + side + " units, " + "color: " + getColor());
    }
}
