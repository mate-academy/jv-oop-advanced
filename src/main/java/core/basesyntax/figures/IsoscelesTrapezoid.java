package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double downSide;
    private double upperSide;
    private double height;

    public IsoscelesTrapezoid(String color, double downSide, double upperSide, double height) {
        this.color = color;
        this.downSide = downSide;
        this.upperSide = upperSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (downSide + upperSide) / 2 * height;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + Math.round(calculateArea() * 10.0) / 10.0
                + " sq. units, downSide: " + (int)downSide + " units, upperSide: " + (int)upperSide
                + " units, height: " + (int)height + " units, color: " + color.toLowerCase());
    }
}