package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double height;
    private double base1;
    private double base2;

    public IsoscelesTrapezoid(String color, double height, double base1, double base2) {
        super(color);
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("isosceles trapezoid,"
                + " area: " + getArea() + " sq. units,"
                + " base1: " + base1 + " units,"
                + " base2: " + base2 + " units,"
                + " height: " + height + " units,"
                + " color: " + getColor());
    }
}
