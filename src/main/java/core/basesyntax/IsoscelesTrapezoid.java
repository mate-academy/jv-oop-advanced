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
    public double calculateArea() {
        return 0.5 * (this.base1 + this.base2) * this.height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: "
                + calculateArea() + " sq. units, base1: "
                + this.base1 + " units, base2: " + this.base2
                + " units, height: " + this.height
                + " units, color: " + this.getColor());
    }
}
