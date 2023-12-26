package core.basesyntax;

public class IsoscelesTrapezoid extends FigureForOther {
    public IsoscelesTrapezoid(String color, int a, int b, int c) {
        super(color, a, b, c);
    }

    @Override
    public double area() {
        return Math.pow(getThirdSide(), 2) - Math.pow(getSecondSide() - getFirstSide(), 2);
    }

    @Override
    public void fullInfo() {
        System.out.println("Figure: trapezoid, area: " + area()
                + " sq. units, small side: " + getFirstSide()
                + " units, big side: " + getSecondSide() + " units, left or right side: "
                + getThirdSide() + " units, color: " + getColor());
    }
}
