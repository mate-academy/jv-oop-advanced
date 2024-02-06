package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private final int base1;
    private final int base2;
    private final int height;

    public IsoscelesTrapezoid(String color, int base1, int base2, int height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public int getBase1() {
        return base1;
    }

    public int getBase2() {
        return base2;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int calculateArea() {
        return (base1 + base2) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + calculateArea()
                + " sq.units, base1: "
                + base1
                + " units, base2: "
                + base2
                + " units, height: "
                + height
                + " units, color: "
                + getColor());
    }
}
