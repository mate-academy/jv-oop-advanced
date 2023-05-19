package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstSide, int secondSide) {
        setColor(color);
        this.firstLeg = firstSide;
        this.secondLeg = secondSide;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure:RightRectangle,"
                + "area:" + getArea()
                + " sq.units,firstLeg:"
                + firstLeg + " units,secondLeg:" + secondLeg + " units,color:" + getColor());
    }
}
