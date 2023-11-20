package core.basesyntax.figures;

import core.basesyntax.interfaces.Area;
import core.basesyntax.interfaces.Draw;

public class IsoscelesTrapezoid extends Figure implements Area, Draw {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid{color: "
                + getColor()
                + "; upperBase: "
                + upperBase
                + "; lowerBase: "
                + lowerBase
                + "; height: "
                + height
                + "; area: "
                + getArea()
                + "}");
    }
}
