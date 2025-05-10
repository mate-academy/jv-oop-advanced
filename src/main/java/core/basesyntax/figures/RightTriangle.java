package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + ", firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg
                + ", color: " + getColor());
    }
}
