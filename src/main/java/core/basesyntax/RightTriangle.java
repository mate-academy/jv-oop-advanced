package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double HALF = 0.5;

    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return HALF * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(
                "RightTriangle, color: " + getColor()
                        + ", legs: " + firstLeg + ", " + secondLeg
                        + ", area: " + getArea()
        );
    }
}
