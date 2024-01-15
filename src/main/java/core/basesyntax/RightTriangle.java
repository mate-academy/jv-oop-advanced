package core.basesyntax;

import java.util.Locale;

public class RightTriangle extends Figure {
    private int width;
    private int height;

    public RightTriangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * width * height;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: "
                + getArea() + " sq.units, width: "
                + getWidth() + ", height "
                + getHeight() + ", color: "
                + getColor().toLowerCase(Locale.ROOT);
    }
}
