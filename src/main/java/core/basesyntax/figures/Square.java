package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;

public class Square extends Figure implements AreaCalculator {
    private double side = 0;

    public Square(String colour, double side) {
        super(colour);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Figure: " + Figures.SQUARE.name().toLowerCase() + ", area:" + getArea()
                + " sq.units, side: " + side + " units, color: " + getColour();
    }

}
