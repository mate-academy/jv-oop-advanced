package core.basesyntax.figures;

import core.basesyntax.colors.Color;

public class IsoscelesTrapezoid extends Figure {
    private static final double AREA_DIVIDER = 2;
    private static final double AREA_POWER = 2;
    private final double upperSide;
    private final double bottomSide;
    private final double side;

    public IsoscelesTrapezoid(Color color, double upperSide, double bottomSide, double side) {
        super(color);
        this.upperSide = upperSide;
        this.bottomSide = bottomSide;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid\nColor: " + getColor().name()
                + "\nArea: " + calculateArea() + "\nUpper side: " + upperSide
                + "\nBottom side: " + bottomSide + "\n Side faces: " + side);
    }

    @Override
    public double calculateArea() {
        double oneLeg = (bottomSide - upperSide) / AREA_DIVIDER;
        double height = Math.sqrt(Math.pow(side, AREA_POWER) - Math.pow(oneLeg, AREA_POWER));
        return ((bottomSide + upperSide) / AREA_DIVIDER) * height;
    }
}
