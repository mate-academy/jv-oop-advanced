package core.basesyntax.figures.geometric;

import core.basesyntax.figures.Figure;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + df.format(getArea()) + " sq. units, "
                + "side: " + side + " units, "
                + "color: " + color.toLowerCase());
    }
}
