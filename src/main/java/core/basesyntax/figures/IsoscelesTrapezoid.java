package core.basesyntax.figures;

import core.basesyntax.colors.Color;

public class IsoscelesTrapezoid extends Figure {
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
        System.out.println("Figure: Isosceles trapezoid\nColor: " + getColor()
                + "\nArea: " + calculateArea() + "\nUpper side: " + upperSide
                + "\nBottom side: " + bottomSide + "\n Side faces: " + side);
    }

    @Override
    public double calculateArea() {
        double oneLeg = (bottomSide - upperSide) / 2;
        double height = Math.sqrt(Math.pow(side, 2) - Math.pow(oneLeg, 2));
        return ((bottomSide + upperSide) / 2) * height;
    }
}
