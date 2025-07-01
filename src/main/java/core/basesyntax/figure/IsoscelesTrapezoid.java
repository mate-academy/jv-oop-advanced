package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.logic.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double lowerBaseLength;
    private final double upperBaseLength;
    private final double heightLength;

    public IsoscelesTrapezoid(Color color, double lowerBaseLength,
                              double upperBaseLength, double heightLength) {
        super(color);
        this.lowerBaseLength = lowerBaseLength;
        this.upperBaseLength = upperBaseLength;
        this.heightLength = heightLength;
    }

    @Override
    public double getArea() {
        return ((lowerBaseLength + upperBaseLength) / 2) * heightLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: "
                + getArea()
                + " sq. units, lowerBaseLength: "
                + lowerBaseLength
                + " units, upperBaseLength: "
                + upperBaseLength
                + " units, heightLength: "
                + heightLength + " units, color: "
                + getColor());
    }
}
