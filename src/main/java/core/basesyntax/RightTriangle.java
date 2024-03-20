package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return Math.round(0.5 * firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + this.getArea()
                + " sq. units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + getColor().toLowerCase()
        );
    }
}
