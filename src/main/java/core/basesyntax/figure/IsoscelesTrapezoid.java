package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int downSide;
    private int elevation;

    public IsoscelesTrapezoid(int upperSide, int downSide, int elevation, Color color) {
        this.color = color;
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.elevation = elevation;
    }

    @Override
    public double getArea() {
        return ((upperSide + downSide) / 2) * elevation;
    }

    @Override
    public void getDraw() {
        System.out.println("This is Isosceles Trapezoid. I have Area: " + getArea()
                + "; upperSide: " + upperSide + "; downSide: "
                + downSide + "; elevation: " + elevation + "; and have color: " + getColor());
    }
}
