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
    public double calculateArea() {
        return 0.5 * this.firstLeg * this.secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: "
            + calculateArea() + " sq. units, first leg: "
            + this.firstLeg + " units, second leg: "
            + this.secondLeg + " units, color: "
            + this.getColor());
    }
}
