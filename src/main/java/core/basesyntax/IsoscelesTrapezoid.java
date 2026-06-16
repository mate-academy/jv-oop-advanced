package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
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
        return ((topBase + bottomBase) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: isosceles trapezoid, area: %.2f sq. units," +
                        " top base: %.2f sq. units, bottom base: %.2f sq. units, height: %.2f sq. units" +
                        ", color: %s"
                , getArea(),topBase, bottomBase, height, getColor()));
    }
}
