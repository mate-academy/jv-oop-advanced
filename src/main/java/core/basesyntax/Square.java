package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(String color, double SideLength) {
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
    double getArea() {
        return sideLength * sideLength;
    }

    @Override
    void draw() {
        System.out.println("Square color: " + getColor()
            + ", Side length = " + sideLength
            + "Area = " + getArea());
    }
}
