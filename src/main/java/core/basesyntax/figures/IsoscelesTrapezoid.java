package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int upSide;
    private final int downSide;

    public IsoscelesTrapezoid(String color, int height, int upSide, int downSide) {
        super(color);
        this.height = height;
        this.upSide = upSide;
        this.downSide = downSide;
    }

    @Override
    public double getArea() {
        return (upSide + downSide) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea() + " sq.units, height: "
                + height + " units, upSide: " + upSide + " units, downSide: " + downSide
                + " units, color: " + getColor());
    }
}
