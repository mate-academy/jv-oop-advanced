package core.basesyntax;

public class RightTriangle extends BaseFigure {
    private int legBase;
    private int legHeight;

    public RightTriangle(int legBase, int legHeight, Color color) {
        super(color);
        this.legBase = legBase;
        this.legHeight = legHeight;
    }

    @Override
    public double getArea() {
        return 0.5 * legBase * legHeight;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %.1f sq.units, "
                        + "leg base: %d units, leg height: %d units, color: %s%n",
                getArea(), legBase, legHeight, color.toString().toLowerCase());
    }
}
