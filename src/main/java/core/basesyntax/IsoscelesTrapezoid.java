package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private String color;
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        this.color = color;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public double getArea() {
        return (topBase + bottomBase) * height / 2;
    }

    public void draw() {
        System.out.println("IsoscelesTrapezoid: color=" + color
                + ", topBase="
                + topBase + ","
                + " bottomBase="
                + bottomBase
                + ", height="
                + height + ", area="
                + getArea());
    }
}
