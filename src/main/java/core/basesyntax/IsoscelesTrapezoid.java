package core.basesyntax;

import static core.basesyntax.FigureSupplier.DEFAULT_COLOR;

public class IsoscelesTrapezoid extends Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double height;
    private final Color isoscelestrapezoidColor;

    public IsoscelesTrapezoid(double upperBase,
                              double lowerBase,
                              double height, Color randomColor) {
        super(DEFAULT_COLOR);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
        this.isoscelestrapezoidColor = randomColor;
    }

    @Override
    public double getArea() {

        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq.units, upperBase: "
                + upperBase
                + " units, lowerBase: "
                + lowerBase
                + " units, height: "
                + height
                + " units, color: "
                + isoscelestrapezoidColor);
    }
}
