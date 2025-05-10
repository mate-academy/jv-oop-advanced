package core.basesyntax.figure;

import core.basesyntax.suppliers.Color;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double upperBase;
    private double lowwerBase;

    public IsoscelesTrapezoid(Color color, double height, double upperBase, double lowwerBase) {
        super(color);
        this.height = height;
        this.upperBase = upperBase;
        this.lowwerBase = lowwerBase;
    }

    @Override
    public double getArea() {
        return (upperBase + lowwerBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + "sq.units, height: " + height
                + "sq.units, upperBase: " + upperBase
                + "sq.units, lowwerBase: " + lowwerBase
                + "units, color: " + getColor());
    }
}
