package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topLength;
    private final double bottomLength;
    private final double height;

    public IsoscelesTrapezoid(Color color, double topLength, double bottomLength, double height) {
        super(color);
        this.topLength = topLength;
        this.bottomLength = bottomLength;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topLength * bottomLength) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area:" + getArea()
                + " sq.units, top length: " + topLength + " units, bottom length: "
                + bottomLength + " units, height: " + height
                + "units, color: " + getColor());
    }
}
