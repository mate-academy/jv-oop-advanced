package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public IsoscelesTrapezoid(int sideA, int sideB, int sideC, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        setColor(color);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + new DecimalFormat("#.##").format(getArea()) + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB + " units, sideC: " + sideC + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return (double) (sideA + sideB) / 2 * Math.sqrt(Math.pow(sideC, 2)
                - Math.pow(sideA - sideB, 2) / 4);
    }
}
