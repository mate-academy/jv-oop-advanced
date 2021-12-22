package model;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(int base1, int base2, int height, String color) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        setColor(color);
    }

    public IsoscelesTrapezoid() {
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: " + getArea()
                + " sq.units, base1: " + base1 + " units, base2: " + base2 + " units, height: "
                + height + " units, color: " + getColor());
    }
}
