package core.basesyntax;

public class RightTriangle extends Figure {
    public int firstLeg;
    public int secondLeg;

    @Override
    public void toDraw() {
        System.out.println("Figure: triangle, area: "
                + getArea()
                + "sq. units, firstLeg: "
                + firstLeg
                + "units,secondLeg: "
                + secondLeg
                + "units,color: "
                + color);
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) /2;
    }
}
