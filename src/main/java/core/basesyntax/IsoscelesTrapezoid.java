package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(Color color, int base1, int base2, int height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + calculate() + " sq. units, base1: "
                + base1 + " units, base2: "
                + base2 + " units, height: "
                + height + " units, color: "
                + color.name().toLowerCase());
    }

    @Override
    public double calculate() {
        return ((double) (base1 + base2) / 2) * height;
    }
}
