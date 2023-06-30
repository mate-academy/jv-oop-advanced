package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure {
    private int bottomSide;
    private int topSide;
    private int height;

    public IsoscelesTrapezoid(Color color, int bottomSide, int topSide, int height) {
        super(color);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = (double) (topSide + bottomSide) / 2 * height;
        return area;
    }

    @Override
    public String draw() {
        return "Figure : isosceles trapezoid, area: "
                + calculateArea() + " sq.units,"
                + " bottomSide: " + bottomSide + " units,"
                + " topSide: " + topSide + " units,"
                + " height: " + height + " height,"
                + " color: " + getColor();
    }
}
