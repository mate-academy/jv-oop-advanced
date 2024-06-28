package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int top;
    private final int bottom;
    private final int height;

    public IsoscelesTrapezoid(int top, int bottom, int height, String color) {
        this.top = top;
        this.bottom = bottom;
        this.height = height;
        this.setColor(color);
        this.setType("isosceles trapezoid");
    }

    @Override
    public double getArea() {
        return (top + bottom) * 0.5 * height;
    }

    @Override
    public String draw() {
        return "Figure: "
                + getType() + ", "
                + "area: "
                + this.getArea()
                + " sq. units, "
                + "top: "
                + top
                + " units, "
                + "bottom: "
                + bottom
                + " units, "
                + "height: "
                + height
                + " units, "
                + "color: "
                + getColor();
    }
}
