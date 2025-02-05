package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private final double base;
    private final double top;
    private final double height;

    public IsoscelesTrapezoid(String color, double base, double top, double height) {
        super(color);
        this.base = base;
        this.top = top;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (base + top) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: "
                + calculateArea() + " sq. units, base: "
                + base + " units, top: "
                + top + " units, height: "
                + height + " units, color: " + getColor());
    }
}



