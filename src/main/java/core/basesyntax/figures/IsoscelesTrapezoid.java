package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure {
    private int bottomBase;
    private int topBase;
    private int height;

    {
        name = "isosceles trapezoid";
    }

    public IsoscelesTrapezoid(int bottomBase, int topBase, int height, Color color) {
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
        this.color = color.name().toLowerCase();
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
    public String toString() {
        return super.toString()
                + "bottom base: "
                + getBottomBase()
                + " units, "
                + "top base: "
                + getTopBase()
                + " units, "
                + "height: "
                + getHeight()
                + " units";
    }

    @Override
    public void findArea() {
        area = ((getBottomBase() + getTopBase()) / 2.00) * getHeight();
    }
}
