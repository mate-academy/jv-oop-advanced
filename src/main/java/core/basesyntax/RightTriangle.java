package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private String color;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea() + " square units, firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: "
                + getColor());
    }

    @Override
    public String getColor() {
        return color;
    }
}
