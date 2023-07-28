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
        return 0;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.printf(", firstLeg: %f units, secondLeg: %f units, color: %s%n",
                firstLeg, secondLeg, getColor());
    }
}
