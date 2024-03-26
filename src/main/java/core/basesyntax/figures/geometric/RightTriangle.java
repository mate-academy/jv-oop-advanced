package core.basesyntax.figures.geometric;

import core.basesyntax.figures.Figure;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * (side * side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + df.format(getArea()) + " sq. units, "
                + "side: " + side + " units, "
                + "color: " + color.toLowerCase());
    }
}
