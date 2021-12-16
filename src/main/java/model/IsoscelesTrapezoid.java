package model;

public class IsoscelesTrapezoid extends Figure {
    private final int base1;
    private final int base2;
    private final int height;

    public IsoscelesTrapezoid(int base1, int base2, int height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public Object draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: " + getArea()
                + " sq.units, base1: " + base1 + " units, base2: " + base2 + " units, height: "
                + height + " units, color: " + color);
        return null;
    }
}
