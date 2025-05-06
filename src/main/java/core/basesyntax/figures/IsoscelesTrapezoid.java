package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureType;

public class IsoscelesTrapezoid extends Figure {
    private final int base;
    private final int side;
    private final int height;

    public IsoscelesTrapezoid(int side, int base, int height, String color) {
        super(color);
        this.side = side;
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.ISOSCELESTRAPEZOID.name()
                + ", area: " + area() + " sq. units"
                    + ", sideUp: " + side + " units, " + "sideDown: " + base + " units, "
                        + "height: " + height + " units," + "color: " + getColor());
    }

    @Override
    public double area() {
        return ((double) (side + base) / 2) * height;
    }
}
