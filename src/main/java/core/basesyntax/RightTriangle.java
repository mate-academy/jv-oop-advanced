package core.basesyntax;

public class RightTriangle implements AreaCalculable, Drawable {
    private final String color;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: triangle, area: %.2f sq. units, firstLeg: %.2f units, secondLeg: %.2f units, color: %s%n",
                getArea(), firstLeg, secondLeg, color
        );
    }
}


