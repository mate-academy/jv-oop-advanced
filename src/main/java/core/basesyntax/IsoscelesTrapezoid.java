package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side;
    private double top;
    private double bottom;

    public IsoscelesTrapezoid(Color color, double side, double top, double bottom) {
        super(color);
        this.side = side;
        this.top = top;
        this.bottom = bottom;
    }

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public double getArea() {
        return (top + bottom) / 2 * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea()
                + " sq. units, color: " + getColor()
                + ", top " + getTop()
                + ", bottom: " + getBottom()
                + ", side: " + getSide());
    }
}
