package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;

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
    public double findArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure, isosceles trapezoid, area " + findArea() + "sq.units, "
                + "base 1: " + " " + getBase1() + "base 2: " + " " + getBase2() + " " + " height: "
                + " " + getHeight() + " units, " + " color: " + this.getColor());
    }
}
