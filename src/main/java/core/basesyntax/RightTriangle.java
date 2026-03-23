package core.basesyntax;

public class RightTriangle extends Figure {

    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        if (firstLeg <= 0 || secondLeg <= 0) {
            throw new IllegalArgumentException("First leg and second leg must be > 0");
        }
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {

        String area = format(getArea());
        String f = format(firstLeg);
        String s = format(secondLeg);
        System.out.printf("Figure: triangle, area: %s sq. units, firstLeg: %s units, secondLeg: %s "
                        + "units, color: %s%n",
                area, f, s, color.toLowerCase());
    }
}
