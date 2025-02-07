package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final Color color;
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(Color color, int height, int base1, int base2) {
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + "sq. units," + "height: " + height
                + "units" + "base1: " + base1 + "units, " + "base2: " + base2 + "color: " + color.name());
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }
}
