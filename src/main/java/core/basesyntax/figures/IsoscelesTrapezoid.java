package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure {
    private double bottomSide;
    private double topSide;
    private double height;

    public IsoscelesTrapezoid(Color color, double bottomSide, double topSide, double height) {
        super(color);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + " sq.units,"
                + " bottomSide: " + bottomSide + " units, topSide: "
                + topSide + "units, height: " + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * height * (topSide + bottomSide);
    }
}
