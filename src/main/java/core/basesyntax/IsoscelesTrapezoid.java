package core.basesyntax;

import java.util.Locale;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(String color,FigureType figureType,
                              int sideA, int sideB, int height) {
        super(color,figureType);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: "
                + String.valueOf(getFigureType()).toLowerCase(Locale.ROOT) + ","
                + " area: "
                + Math.round(getArea() * 100.0) / 100.0 + " sq.units,"
                + " sideA(base1): " + sideA + " units,"
                + " sideB(base2): " + sideB + " units,"
                + " height: " + height + " units,"
                + " color: " + getColor());
    }
}
