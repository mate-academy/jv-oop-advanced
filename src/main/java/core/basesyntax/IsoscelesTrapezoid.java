package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double bottomLength;
    private double upperLength;

    public IsoscelesTrapezoid(Color color, double height, double bottomLength, double upperLength) {
        super(color);
        this.height = height;
        this.bottomLength = bottomLength;
        this.upperLength = upperLength;
    }

    public double getSidesLength() {
        return height;
    }

    public void setSidesLength(double sidesLength) {
        this.height = sidesLength;
    }

    public double getBottomLength() {
        return bottomLength;
    }

    public void setBottomLength(double bottomLength) {
        this.bottomLength = bottomLength;
    }

    public double getUpperLength() {
        return upperLength;
    }

    public void setUpperLength(double upperLength) {
        this.upperLength = upperLength;
    }

    @Override
    public double calculateArea() {
        return (upperLength + bottomLength) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area:" + calculateArea()
                + " sq.units, bottom side: " + getBottomLength()
                + ", upper side: " + getUpperLength() + " color: " + getColor());
    }
}
