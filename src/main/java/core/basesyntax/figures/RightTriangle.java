package core.basesyntax.figures;

public class RightTriangle extends AbstractFigure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, "
                + "first leg: " + firstLeg + " units, second leg " + secondLeg
                + " units, color: " + color.toLowerCase());
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
