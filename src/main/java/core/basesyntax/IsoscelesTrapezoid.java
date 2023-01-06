package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottom;
    private int top;
    private int side;

    public IsoscelesTrapezoid(Color color, int bottom, int top, int side) {
        super(Shape.ISOSCELES_TRAPEZOID, color);
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
        System.out.println(this);
    }

    @Override
    public double getArea() {
        double height = 2 * this.getSide() / (this.bottom + this.getTop());
        return (this.getBottom() + this.getTop() * height) / 2;
    }

    @Override
    public String toString() {
        return "Figure: " + this.getShape() + ", area: " + this.getArea()
                + " sq.units, bottom side: " + bottom + " sq.units, top side: "
                + top + " sq.units, side: " + side
                + " sq.units, color: " + this.getColor();
    }
}
