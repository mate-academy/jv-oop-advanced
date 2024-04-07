package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private final double topBase;
    private final double bottomBase;
    private final double height;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height, Color color) {
        super(color);
        if (topBase <= 0 || bottomBase <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive.");
        }
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;

    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public double obtain() {
        return ((topBase + bottomBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + obtain()
                + " sq. units, base1: " + topBase
                + " units, base2: " + bottomBase
                + " units, height: " + height
                + " units, color: " + color);
    }
}
