package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;

public class RightTriangle extends Figure implements Drawable, AreaCalculator {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw(Figure triangle) {
        System.out.println("Figure: rectangle, area: " + getArea(triangle) + " sq. units, "
                + "first leg: " + firstLeg + " units, "
                + "second leg: " + secondLeg + " units, "
                + "color: " + triangle.color);
    }

    @Override
    public double getArea(Figure figure) {
        return this.firstLeg * this.secondLeg / 2;
    }
}
