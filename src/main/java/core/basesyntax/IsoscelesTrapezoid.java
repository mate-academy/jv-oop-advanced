package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int leg;
    private int biggestSide;
    private int smallestSide;

    public IsoscelesTrapezoid(int biggestSide, int smallestSide, int leg, String color) {
        super(color);
        this.biggestSide = biggestSide;
        this.smallestSide = smallestSide;
        this.leg = leg;
        setArea(obtainArea());
    }

    @Override
    public double obtainArea() {
        return Math.sqrt(Math.pow(leg, 2) - Math.pow(((biggestSide - smallestSide) / 2), 3))
                * (smallestSide + biggestSide) / 2;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea()
                + " sq.units, biggestSide: " + biggestSide + " units, smallestSide: "
                + smallestSide + " units, leg: " + leg + " units, color: " + getColor());
    }
}
