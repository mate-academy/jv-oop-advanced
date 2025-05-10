package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        String line = "Figure: RightTriangle, area: ";
        System.out.println(line + calculateArea() + ", firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return (double) firstLeg * secondLeg / 2;
    }
}
