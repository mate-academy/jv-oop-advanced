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

    @Override
    public double getArea() {
        return ((double) (base1 + base2) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea()
                + " sq. units, base1: "
                + base1 + "base2" + base2 + " units, color: " + getColor());
    }

}
