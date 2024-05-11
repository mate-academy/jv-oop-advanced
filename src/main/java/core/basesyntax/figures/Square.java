package core.basesyntax.figures;

import core.basesyntax.utility.Utility;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: "
                + "square, area: " + Utility.roundAfterPoint(getArea(), 1) + " sq. units,"
                + " side: " + side + " units,"
                + " color: " + getColor()
        );
    }
}
