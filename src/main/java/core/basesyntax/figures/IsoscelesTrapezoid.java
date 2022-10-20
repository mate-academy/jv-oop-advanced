package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int height;

    public IsoscelesTrapezoid(String color, String name, int base1, int base2, int height) {
        super(color, name);
        this.firstBase = base1;
        this.secondBase = base2;
        this.height = height;
    }

    @Override
    public String printInfo() {
        return super.printInfo()
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
