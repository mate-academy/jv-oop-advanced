package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String name() {
        return String.valueOf(Figures.RIGHT_TRIANGLE);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name()
                + ", area: " + getArea()
                + ", firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg
                + ", color: " + getColor());
    }
}
