package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private final int base1;
    private final int base2;
    private final int heigth;

    public IsoscelesTrapezoid(int base1, int base2, int heigth, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.heigth = heigth;
    }

    public int getBase1() {
        return base1;
    }

    public int getBase2() {
        return base2;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    public double getArea() {
        return (((double) base1 + (double) base2) / 2) * heigth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + "sq.units , Base 1: " + getBase1()
                + " units Base 2: " + getBase2() + " units, color: " + getColor());
    }
}
