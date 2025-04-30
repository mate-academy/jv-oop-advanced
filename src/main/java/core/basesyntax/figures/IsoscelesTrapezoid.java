package core.basesyntax.figures;

import core.basesyntax.util.Color;

public class IsoscelesTrapezoid extends Figure {
    private int heigh;
    private int lowSide;
    private int hightSide;

    public IsoscelesTrapezoid(Color color, int heigh, int lowSide, int hightSide) {
        super(color);
        this.heigh = heigh;
        this.lowSide = lowSide;
        this.hightSide = hightSide;
    }

    @Override
    public double calculateArea() {
        return this.heigh / 2 * (this.lowSide + this.hightSide);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + calculateArea()
                + " sq. units, " + "height: " + heigh
                + " low Side: " + lowSide + " units, hight Side: "
                + hightSide + " units, color: " + getColor());
    }
}
