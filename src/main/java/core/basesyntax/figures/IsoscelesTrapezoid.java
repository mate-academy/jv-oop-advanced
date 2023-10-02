package core.basesyntax.figures;

import core.basesyntax.color.Color;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int side;

    public IsoscelesTrapezoid(Color color, int topBase, int bottomBase, int side) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (topBase + bottomBase) / 2.0 * (Math.pow(Math.pow(side, 2)
                - Math.pow(bottomBase - topBase, 2) / 4, 0.5));
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, one base: "
                + topBase + " units, second base: " + bottomBase
                + " units, side: " + side + " units, color: " + getColor());
    }
}
