package core.basesyntax.fiqures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int hight;
    private int midleLine;

    public IsoscelesTrapezoid(int hight, int midleLine) {
        this.hight = hight;
        this.midleLine = midleLine;
    }

    @Override
    public double getArea() {
        return hight * midleLine;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + "sq.units, hight: "
                + hight + ", midleLine: " + midleLine + ", color: " + getColor());
    }
}
