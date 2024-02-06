package core.basesyntax.modul;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square"
                + ", area: " + getArea()
                + ", side: " + side
                + ", color: " + getColor());
    }
}
