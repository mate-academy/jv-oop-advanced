package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private final int side;
    private final String color;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle" + ", area: " + area() + " sq. units"
                + ", side: " + side + " units, " + "color: " + color);
    }

    @Override
    public double area() {
        return side * side;
    }
}
