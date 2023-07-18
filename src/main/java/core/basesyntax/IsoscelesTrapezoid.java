package core.basesyntax;

class IsoscelesTrapezoid extends AbstractFigure {
    private String color;
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
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
        System.out.println("Isosceles Trapezoid - Color: " + getColor() + ", Top Base: "
                + topBase + ", Bottom Base: " + bottomBase + ", Height: " + height
                + ", Area: " + getArea());
    }
}
