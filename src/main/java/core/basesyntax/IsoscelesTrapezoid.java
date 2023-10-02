package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double legs;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double legs, String color) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.legs = legs;
    }

    @Override
    public double getArea() {
        return 0.5 * (topBase + bottomBase) * legs;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, topBase: " + topBase
                + " units, bottomBase: " + bottomBase + " units, legs: "
                + legs + " units, color: " + color);
    }
}
