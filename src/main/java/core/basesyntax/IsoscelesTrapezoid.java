package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(int base1, int base2, int height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public void area() {
        double areaIsoscelesTrapezoid = (base1 + base2) / 2 * height;
        System.out.println("Figure: isosceles trapezoid, area: " +
                areaIsoscelesTrapezoid + " sq.units, base1: " + base1 +
                " units, base2: " + base2 + " units, height: " + height +
                " units, color: " + getColor());
    }
}
