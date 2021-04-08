package core.basesyntax.figure;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int topBase;
    private int bottomBase;

    public IsoscelesTrapezoid(int sideA, int sideB, int height,
                              String name, String color) {
        super(color, name);
        this.height = height;
        this.topBase = sideA;
        this.bottomBase = sideB;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * (height / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, side a: " + topBase
                + " units, side b: " + bottomBase
                + " units, height: " + height
                + " units, color: " + getColor());
    }

    public double getHeight() {
        return height;
    }

    public double getTopBase() {
        return topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }
}
