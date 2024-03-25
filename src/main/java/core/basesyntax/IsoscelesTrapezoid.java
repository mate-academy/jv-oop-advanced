package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private final int base1;
    private final int base2;
    private final int height;

    public IsoscelesTrapezoid(int base1, int base2, int height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, base1: "
                + base1 + " units, base2: " + base2 + " units, height: "
                + height + " units, color: " + color);
    }
}
