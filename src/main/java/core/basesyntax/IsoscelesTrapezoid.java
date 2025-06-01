package core.basesyntax;

public class IsoscelesTrapezoid implements Figure, Colorable {
    private double topBase;
    private double bottomBase;
    private double height;
    private String color;

    public IsoscelesTrapezoid(String color, double topBase,
                              double bottomBase, double height) {
        this.color = color;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, top base: " + topBase
                + " units, bottom base: " + bottomBase
                + " units, height: " + height + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
