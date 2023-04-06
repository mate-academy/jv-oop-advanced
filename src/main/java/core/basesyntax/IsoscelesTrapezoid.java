package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double littleSide;
    private double bigSide;
    private double altitude;

    public IsoscelesTrapezoid(double littleSide, double bigSide, double altitude, String color) {
        super(color);
        this.littleSide = littleSide;
        this.bigSide = bigSide;
        this.altitude = altitude;
    }

    @Override
    public double getArea() {
        return (littleSide + bigSide) * 0.5 * altitude;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, little side: " + littleSide + " units, big side: "
                + bigSide + " units, altitude: " + altitude + " units, color: " + color);
    }
}
