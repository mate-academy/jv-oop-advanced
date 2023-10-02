package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.figureType = "triangle";
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.area = 0.5 * firstLeg * secondLeg;

    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + figureType + ", area: " + area + " sq.units, first leg: "
                + firstLeg + ", second leg: " + secondLeg + ", color: " + color);
    }
}
