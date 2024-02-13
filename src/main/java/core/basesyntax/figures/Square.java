package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;

public class Square extends Figure implements Drawable, AreaCalculator {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw(Figure square) {
        System.out.println("Figure: square, area: " + getArea(square) + " sq. units, "
                + "side: " + getSide() + " units, "
                + "color: " + square.color);
    }

    @Override
    public double getArea(Figure figure) {
        return Math.pow(this.getSide(), 2);
    }

    public double getSide() {
        return side;
    }
}
