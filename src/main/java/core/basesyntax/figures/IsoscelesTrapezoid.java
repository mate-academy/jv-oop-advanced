package core.basesyntax.figures;

import core.basesyntax.variables.Color;

public class IsoscelesTrapezoid extends Figure {
    private double top;
    private double bottom;
    private double height;

    public IsoscelesTrapezoid(Color color, double top, double bottom, double side) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.height = side;
    }

    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public double getSide() {
        return height;
    }

    public void setSide(double side) {
        this.height = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (top + bottom) * height / 2;
    }

    @Override
    public String toString() {
        return "Figure: right triangle"
                + ", area: " + calculateArea()
                + " sq. units"
                + ", top: " + getTop()
                + ", bottom: " + getBottom()
                + ", side: " + getSide()
                + ", height: " + getHeight()
                + ", color: " + getColor();
    }
}
