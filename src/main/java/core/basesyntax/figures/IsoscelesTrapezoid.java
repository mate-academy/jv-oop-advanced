package core.basesyntax.figures;

import core.basesyntax.util.Colors;

public class IsoscelesTrapezoid extends Figure {
    private int heigh;
    private int lowSide;
    private int hightSide;

    public IsoscelesTrapezoid(Colors color) {
        super(color);
        this.heigh = getRandomNum();
        this.lowSide = getRandomNum();
        this.hightSide = getRandomNum();
    }

    @Override
    public double getArea() {
        return this.heigh / 2 * (this.lowSide + this.hightSide);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + getArea()
                + " sq. units, " + "height: " + heigh
                + " low Side: " + lowSide + " units, hight Side: "
                + hightSide + " units, color: " + getColor());
    }
}
