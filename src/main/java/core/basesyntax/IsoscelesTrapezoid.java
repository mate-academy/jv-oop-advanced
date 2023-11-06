package core.basesyntax;

class IsoscelesTrapezoid implements Figure {
    private String color;
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        this.bottomBase = bottomBase;
        this.color = color;
        this.height = height;
        this.topBase = topBase;
    }

    public double getArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, topBase: " + topBase + " units, bottomBase: " + bottomBase
                + " units, height: " + height + " units, color: " + color);
    }
}
