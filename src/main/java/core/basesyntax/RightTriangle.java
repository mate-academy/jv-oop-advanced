package core.basesyntax;

public class RightTriangle extends Figure {
    private final String name;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        name = "right triangle";
        setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s, area: %.3f sq.units, first leg: "
                        + "%s units, second leg: %s units, color: %s",
                name, getArea(), firstLeg, secondLeg, getColor()));
    }
}
