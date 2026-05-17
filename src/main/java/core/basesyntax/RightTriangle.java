package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + this.calculateArea()
                + "sq. units, first leg: "
                + this.firstLeg
                + " units, second leg: "
                + this.secondLeg
                + " units, color: "
                + this.color);
    }

    public double calculateArea() {
        return (this.firstLeg * this.secondLeg) / 2.0;
    }
}
