package core.basesyntax.figures;

import core.basesyntax.Area;
import core.basesyntax.Drawable;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure implements Drawable, Area {
    private final int firstSide;
    private final int secondSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid has " +  firstSide
                + ", secondSide " + secondSide + ", height " +  height
                + " and area " + getArea()
                + " units" + "color: " +  getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return ((double) (firstSide + secondSide) / 2 * height);
    }
}
