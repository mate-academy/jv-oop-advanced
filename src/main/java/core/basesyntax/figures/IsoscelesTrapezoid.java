package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int altitude;

    public IsoscelesTrapezoid(String color, int top, int bottom, int altitude) {
        super(color);
        this.top = top < bottom ? top : bottom;
        this.bottom = bottom > top ? bottom : top;
        this.altitude = altitude;
    }

    @Override
    public double getArea() {
        return (top + bottom) * altitude / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: "
                + "Isosceles trapezoid, area: " +  (double) ((long) (getArea() * 10)) / 10 + " sq. units,"
                + " top: " + top + " units,"
                + " bottom: " + bottom + " units,"
                + " altitude: " + altitude + " units,"
                + " color: "  + getColor()

        );
    }
}
