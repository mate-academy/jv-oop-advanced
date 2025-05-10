package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int topBase;
    private final int bottomBase;

    public IsoscelesTrapezoid(String color, int height, int topBase, int bottomBase) {
        super(color);
        this.height = height;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, height: "
                + height + " units, top base of trapesoid: " + topBase
                + " units, bottom base of trapesoid: "
                + bottomBase + " units, color: " + color);
    }
}
