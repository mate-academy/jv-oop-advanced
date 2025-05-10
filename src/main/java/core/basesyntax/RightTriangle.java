package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private final Color color;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea() + " sq. units, " + "firstLeg: " + firstLeg
                + " units, " + "secondLeg: " + secondLeg + " units, " + "color: " + color.name());
    }
}
