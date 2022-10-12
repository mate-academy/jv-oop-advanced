package core.basesyntax.figures;

import core.basesyntax.AreaCalculation;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure implements AreaCalculation {

    private final int base1;
    private final int base2;
    private final int height;

    public IsoscelesTrapezoid(String color, String name, int base1, int base2, int height) {
        super(color, name);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public String printInfo() {
        return super.printInfo()
                + " base1: "
                + base1
                + " units"
                + " base2: "
                + base2
                + " units"
                + " height: "
                + height
                + " units";
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }
}
