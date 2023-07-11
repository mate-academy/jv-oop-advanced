package core.basesyntax;

import core.basesyntax.model.Figure;

public class Square extends Figure {

    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure is square: color - " + getColor()
                + ", side length - " + side + ", area - " + getArea());
    }
}
