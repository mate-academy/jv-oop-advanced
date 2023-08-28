package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea()
                + " , first leg: "
                + firstLeg + ", second leg:"
                + secondLeg
                + ", color: "
                + color);
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg / 2;
    }
}
