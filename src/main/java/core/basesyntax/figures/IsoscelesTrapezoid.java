package core.basesyntax.figures;

import core.basesyntax.EnumFigure;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int upSide;
    private int lowSide;

    public IsoscelesTrapezoid(String color, int height, int upSide, int lowSide) {
        super(color);
        this.height = height;
        this.upSide = upSide;
        this.lowSide = lowSide;
    }

    @Override
    public double getArea() {
        return (double)((upSide + lowSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + EnumFigure.ISOSCELES_TRAPEZOID.toString().toLowerCase()
                + ", area: " + getArea() + "units,"
                + " height: " + height + "units,"
                + " upSide: " + upSide + "units,"
                + " lowSide: " + lowSide + "units,"
                + " color: " + getColor().toLowerCase());
    }
}
