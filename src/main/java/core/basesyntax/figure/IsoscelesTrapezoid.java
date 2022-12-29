package core.basesyntax.figure;

import core.basesyntax.color.Color;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double topBase;
    private double bottomBase;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        this.color = color;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public IsoscelesTrapezoid(Color color, double topBase, double bottomBase, double height) {
        this.color = color.name().toLowerCase();
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public void setTopBase(double topBase) {
        this.topBase = topBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    public void setHeight(double height) {
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
        String str = "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, top base: " + topBase + ", bottom base: "
                + bottomBase + ", leg: " + height + ", color: " + color;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * height / 2;
    }
}
