package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String name, int base, int height, Color color) {
        super(name, color);
        this.base = base;
        this.height = height;
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
