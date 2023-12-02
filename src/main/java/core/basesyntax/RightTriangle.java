package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.base = firstLeg;
        this.height = secondLeg;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %.1f sq. units, base: %d units, height: %d units, color: %s\n"
                , getArea(), base, height, color);
    }
}
