package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private double littleSide;
    private double bigSide;
    private double altitude;
    private Random random = new Random();

    public IsoscelesTrapezoid(double littleSide, double bigSide, double altitude, String color) {
        super(color);
        this.littleSide = littleSide;
        this.bigSide = bigSide;
        this.altitude = altitude;
    }

    public IsoscelesTrapezoid() {
        littleSide = random.nextDouble();
        bigSide = random.nextDouble();
        altitude = random.nextDouble();
        setColor(random);
        this.color = getColor();
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
