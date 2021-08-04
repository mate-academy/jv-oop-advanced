package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottom;
    private int top;
    private int side;

    public IsoscelesTrapezoid(String color,int bottom, int top, int side) {
        super(color);
        this.bottom = bottom;
        this.top = top;
        this.side = side;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, bottom: " + bottom + " units, top: " + top + " units, side: "
                + side + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (bottom + top) / 2 * Math.sqrt(side * side - (bottom - top) * (bottom - top) / 4);
    }
}
