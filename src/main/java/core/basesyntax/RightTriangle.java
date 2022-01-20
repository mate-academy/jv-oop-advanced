package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String figure, String color, double firstLeg, double secondLeg) {
        super(figure, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void getInformation() {
        System.out.println("Figure : " + getFigure() + ", color : "
                + getColor() + ", first leg : " + firstLeg
                + " units, second leg : " + secondLeg
                + " units, area : " + getArea() + " sq.units");
    }
}
