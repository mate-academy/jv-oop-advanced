package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int base1;
    private int base2;

    public IsoscelesTrapezoid(String color, int height, int base1, int base2) {
        this.color = color;
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase1() {
        return base1;
    }

    public void setBase1(int base1) {
        this.base1 = base1;
    }

    public int getBase2() {
        return base2;
    }

    public void setBase2(int base2) {
        this.base2 = base2;
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height * 1.0 / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, "
                + "area: %.2f sq.units, "
                + "height: %d units, "
                + "base 1: %d units, "
                + "base 2: %d units, "
                + "color: %s"
                + System.lineSeparator(), getArea(), height, base1, base2, color);
    }
}
