package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int height;

    public IsoscelesTrapezoid(Color color, int base1, int base2, int height) {
        super(color);
        this.top = base1;
        this.bottom = base2;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + calculate() + " sq. units, top: "
                + top + " units, bottom: "
                + bottom + " units, height: "
                + height + " units, color: "
                + color.name().toLowerCase());
    }

    @Override
    public double calculate() {
        return ((double) (top + bottom) / 2) * height;
    }
}
