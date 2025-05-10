package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure {
    private int bottomBase;
    private int topBase;
    private int height;

    public IsoscelesTrapezoid(String name, int bottomBase, int topBase, int height, Color color) {
        super(name, color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    public int getBottomBase() {
        return this.bottomBase;
    }

    public int getTopBase() {
        return this.topBase;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", color: " + getColor()
                + ", area: " + format.format(getArea()) + " sq. units, "
                + "bottom base: " + getBottomBase() + " units, "
                + "top base: " + getTopBase() + " units, "
                + "height: " + getHeight() + " units");
    }

    @Override
    public double getArea() {
        return ((getBottomBase() + getTopBase()) / 2.00) * getHeight();
    }
}
