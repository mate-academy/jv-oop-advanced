package core.basesyntax.figures;

import core.basesyntax.EnumFigure;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int height;

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double)((getFirstSide() + getSecondSide()) / 2) * height;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + EnumFigure.ISOSCELES_TRAPEZOID.toString().toLowerCase()
                + ", area: " + getArea() + "units,"
                + " height: " + height + "units,"
                + " side1: " + getFirstSide() + "units,"
                + " side2: " + getFirstSide() + "units,"
                + " color: " + getColor().toLowerCase());
    }
}
