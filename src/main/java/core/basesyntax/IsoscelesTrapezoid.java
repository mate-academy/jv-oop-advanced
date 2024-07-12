package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(int base1, int base2, int height, String color) {
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
    public void draw() {
        System.out.println("Drawing a isoscales trapezoid");
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2.0 * height;
    }

    @Override
    public void getFigureData() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq. units, first base: " + getBase1()
                + " units, second base: " + getBase2()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}
