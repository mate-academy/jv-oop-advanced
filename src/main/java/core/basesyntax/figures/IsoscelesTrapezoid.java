package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double top;
    private double bottom;
    private double altitude;

    public IsoscelesTrapezoid(String color, double top, double bottom, double altitude) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.altitude = altitude;
    }

    @Override
    public double getArea() {
        return (top + bottom) * altitude / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(
                "This is a "
                + this.getColor()
                + " isosceles trapezoid with bottom side = " + bottom + " cm "
                + " rectangle with altitude = " + altitude + " cm "
                + " rectangle with top = " + top + " cm "
                + " and area " + this.getArea() + " square cm"
        );
    }
}
