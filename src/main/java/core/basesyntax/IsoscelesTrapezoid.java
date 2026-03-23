package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topBase;
    private final double bottomBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        super(color);
        if (topBase <= 0 || bottomBase <= 0 || height <= 0) {
            throw new IllegalArgumentException("Top base, bottom base and height must be > 0");
        }
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 2) * height;
    }

    @Override
    public void draw() {
        String area = format(getArea());
        String top = format(topBase);
        String bottom = format(bottomBase);
        String h = format(height);
        String tpl = "Figure: trapezoid, area: %s sq. units, top: %s, "
                + "bottom: %s, height: %s, color:%s%n";
        System.out.printf(tpl, area, top, bottom, h, color.toLowerCase());
    }
}
