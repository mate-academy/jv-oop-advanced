package core.basesyntax;

public class RightTriangle extends FigureForTriangle {
    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color, firstLeg, secondLeg);
    }

    @Override
    public double area() {
        return (getFirstLeg() * getSecondLeg()) / 2;
    }

    @Override
    public void fullInfo() {
        System.out.println("Figure: triangle, area: " + area()
                + " sq. units, firstLeg: " + getFirstLeg()
                + " units, secondLeg: " + getSecondLeg()
                + " units, color: " + getColor());
    }
}
