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
    public double getArea() {
        return Math.round(0.5 * firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        String result = "Figure: right triangle, area: " + this.getArea()
                + " sq. units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + getColor().toLowerCase() + System.lineSeparator();
        System.out.printf(result);
    }
}
