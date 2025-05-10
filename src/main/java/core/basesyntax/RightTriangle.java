package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    public String draw() {
        return "Figure: RightTriangle, Area: "
                + getArea()
                + " units, First leg: "
                + firstLeg
                + " units, Second leg: "
                + secondLeg
                + " units, "
                + " Figure Color "
                + getColor();
    }

}
