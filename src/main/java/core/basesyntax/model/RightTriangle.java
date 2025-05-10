package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * (firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle , area: " + getArea() + " m2, " + "firstLeg: "
                + firstLeg + " m, " + "secondLeg: " + secondLeg + " m, " + " color: " + getColor());
    }

}
