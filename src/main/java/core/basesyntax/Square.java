package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private double sideLen;

    public Square(String color, double sideLen) {
        super(color);
        this.sideLen = sideLen;
    }

    public double getSideLen() {
        return sideLen;
    }

    public void setSideLen(double sideLen) {
        this.sideLen = sideLen;
    }

    @Override
    public double getArea() {
        return Math.pow(sideLen, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area = " + getArea() + " sq.units,"
                + " side = " + sideLen + " units,"
                + " color = " + getColor());
    }
}
