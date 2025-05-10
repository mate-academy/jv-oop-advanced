package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int adSegment;
    private final int bcSegment;

    public IsoscelesTrapezoid(String color, int height, int adSegment, int bcSegment) {
        super(color);
        this.height = height;
        this.adSegment = adSegment;
        this.bcSegment = bcSegment;
    }

    @Override
    public double getArea() {
        return ((adSegment + bcSegment) / 4)
                * Math.sqrt(4 * height * height
                - (bcSegment - adSegment) * (bcSegment - adSegment));
    }

    @Override
    public String draw() {
        return "Figure: isoscelesTrapezoid, Square: " + getArea()
                + " sq.units, adSegment: " + adSegment
                + " units, bcSegment: " + bcSegment
                + " units, height: " + height
                + " units, Color: " + getColor();
    }
}
