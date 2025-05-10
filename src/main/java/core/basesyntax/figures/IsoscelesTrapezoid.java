package core.basesyntax.figures;

import core.basesyntax.Color;

public class IsoscelesTrapezoid extends Figure {
    private final double topSide;
    private final double bottomSide;
    private final double hight;

    public IsoscelesTrapezoid(Color color, double topSide, double bottomSide, double hight) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.hight = hight;
    }

    @Override
    public double calculateArea() {
        return (topSide + bottomSide) / 2 * hight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + calculateArea() + " sq.units, topSide: "
                + topSide + " units, bottomSide: "
                + bottomSide + " units, hight: "
                + hight + " units, color: "
                + getColor());
    }
}
