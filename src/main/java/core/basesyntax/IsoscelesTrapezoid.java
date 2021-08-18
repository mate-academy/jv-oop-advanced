package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private final int sideA;
    private final int sideB;
    private final int high;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int high) {
        super.setColor(color);
        super.setFigureType(" IsoscelesTrapezoid");
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    @Override
    public double squareOfFigure() {
        return (sideA * sideB) / 2.0 * high;
    }

    @Override
    public String informationOfFigure() {
        return "Figure" + getType() + ", area " + squareOfFigure() + " sq.u, sideA "
                    + sideA + ", sideA " + sideB + " and high " + high + " u., color " + getColor();
    }
}
