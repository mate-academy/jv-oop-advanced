package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    {
        name = "right triangle";
    }

    public RightTriangle(int base, int height, Color color) {
        this.base = base;
        this.height = height;
        this.color = color.name().toLowerCase();
    }

    public int getBase() {
        return this.base;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String drawFigure() {
        return super.drawFigure()
                + "base: "
                + getBase()
                + " units, "
                + "height: "
                + getHeight()
                + " units";
    }

    @Override
    public void findArea() {
        area = getBase() * getHeight() / 2.0;
    }
}
