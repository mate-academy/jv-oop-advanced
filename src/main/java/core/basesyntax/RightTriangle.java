package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;

    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle" + ", area: " + getArea()
                + "sq.units, firstLeg: " + firstLeg + "units, secondLeg: "
                + secondLeg + "units, color: " + getColor());

    }
}
