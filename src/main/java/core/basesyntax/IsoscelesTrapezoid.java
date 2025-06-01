package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private String color;
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height, String color) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Drawable: IsoscelesTrapezoid, area: " + getArea()
                + " topBase: " + topBase
                + " bottomBase: " + bottomBase
                + " height: " + height
                + " color: " + color);

    }
}
