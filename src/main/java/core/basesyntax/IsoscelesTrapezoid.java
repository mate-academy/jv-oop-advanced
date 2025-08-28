package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public double getTopBase() {
        return topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Trapezoid: "
                + "color: " + getColor()
                + ", top base: " + getTopBase()
                + ", bottom base: " + getBottomBase()
                + ", height: " + getHeight()
                + ", area: " + getArea());
    }

    @Override
    double getArea() {
        double area = ((topBase + bottomBase) / 2.0) * height;
        return Math.round(area * NUMBER_FOR_ROUND) / NUMBER_FOR_ROUND;
    }
}
