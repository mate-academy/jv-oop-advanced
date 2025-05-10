package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return getSideLength() * getSideLength();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area = " + getArea()
                + ", sideLength = " + getSideLength() + ", color = " + color);
    }
}
