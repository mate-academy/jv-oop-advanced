package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int side;

    @Override
    public double getArea() {
        return ((top + bottom) / 2) * Math.sqrt(side * side - (bottom - top) * (bottom - top) / 4);
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void drawable() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.2f",getArea())
                + " sq.units, top=" + top
                + ", bottom=" + bottom
                + ", side=" + side
                + ", color=" + getColor());
    }
}
