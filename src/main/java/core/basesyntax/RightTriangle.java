package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: RightTriangle, color: " + color
                + ", firstLeg: " + firstLeg + ", secondLeg: " + secondLeg
                + ", area: " + calculateArea());
    }
}
