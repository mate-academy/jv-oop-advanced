package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int heightLength;
    private int topLength;
    private int bottomLength;

    public IsoscelesTrapezoid(String color, int heightLength, int topLength, int bottomLength) {
        super(color);
        this.heightLength = heightLength;
        this.topLength = topLength;
        this.bottomLength = bottomLength;
    }

    @Override
    public double getArea() {
        return ((topLength + bottomLength) / 2) * heightLength;
    }

    @Override
    public void printInfo() {
        System.out.println(" Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, height length: " + heightLength + " units, top length: "
                + topLength + " bottom length: " + bottomLength
                + " units, color: " + getColor().toLowerCase());
    }
}
