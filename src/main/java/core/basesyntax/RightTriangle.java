package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        setFigureType("triangle");
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setArea(calculateArea());
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType() + ", area: " + getArea()
                + " sq.units, first leg: " + firstLeg + ", second leg: "
                + secondLeg + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
