package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final int SIDE_ISOSCELES_TRAPEZOID = 4;
    private int height;
    private int length;
    private double topLength;

    public IsoscelesTrapezoid(int height, int length, double topLength, Color color) {
        super(color);
        this.height = height;
        this.length = length;
        this.topLength = topLength;
    }

    public IsoscelesTrapezoid() {
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public double getTopLength() {
        return topLength;
    }

    @Override
    double getArea() {
        return 0.5 * (getTopLength() + getLength()) * getHeight();
    }

    @Override
    void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.cm., sides: " + SIDE_ISOSCELES_TRAPEZOID + " units, length: "
                + getLength() + " cm., height: " + getHeight() + " cm., topLengthSide: "
                + getTopLength()
                + " color: " + getColor());
    }
}
