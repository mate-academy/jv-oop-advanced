package core.basesyntax.modul;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void toDraw(double area) {
        System.out.println("Figure: square"
                + ", area: " + area
                + ", side: " + this.side
                + ", color: " + getColor());
    }
}
