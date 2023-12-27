package core.basesyntax;

public class IsoscelesTrapezoid extends FigureForOther {
    public IsoscelesTrapezoid(String color, int a, int b, int c) {
        super(color, a, b, c);
    }

    @Override
    public double calculatorArea() {
        return Math.pow(getThirdSide(), 2) - Math.pow(getSecondSide() - getFirstSide(), 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + calculatorArea()
                + " sq. units, small side: " + getFirstSide()
                + " units, big side: " + getSecondSide() + " units, left or right side: "
                + getThirdSide() + " units, color: " + getColor());
    }
}
