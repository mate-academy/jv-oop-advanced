package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final Color color;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: "
                + calculateArea() + "sq. units, firstLeg: "
                + firstLeg + " units, " + "secondLeg: "
                + secondLeg + " units, "
                + "color: " + color.name());
    }
}
