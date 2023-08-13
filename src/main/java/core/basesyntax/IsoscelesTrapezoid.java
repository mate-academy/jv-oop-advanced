package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s isosceles trapezoid, low base: %.2f,"
                        + " upper base: %.2f, side parts: %.2f, area: %.2f",
                this.color, this.bottomBase, this.topBase,
                this.height, this.getArea()));
    }
}
