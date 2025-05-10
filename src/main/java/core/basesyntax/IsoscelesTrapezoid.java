package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topbase;
    private final int bottombase;
    private final int height;

    public IsoscelesTrapezoid(String name, String color, int topbase, int bottombase, int height) {
        super(name, color);
        this.topbase = topbase;
        this.bottombase = bottombase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topbase + bottombase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, color: %s, bottom base: %d units, "
                        + "top base: %d units, area: %.1f sq. units\n",
                getName(), getColor(), topbase, bottombase, height, getArea());
    }
}
