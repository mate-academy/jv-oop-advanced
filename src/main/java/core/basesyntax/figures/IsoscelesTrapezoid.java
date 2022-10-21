package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int height;

    public IsoscelesTrapezoid(String color,
                              String name,
                              int firstBase,
                              int secondBase,
                              int height) {
        super(color, name);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public String getInfo() {
        return super.getInfo()
                + " base1: "
                + firstBase
                + " units"
                + " base2: "
                + secondBase
                + " units"
                + " height: "
                + height
                + " units";
    }

    @Override
    public double getArea() {
        return 0.5 * (firstBase + secondBase) * height;
    }
}
