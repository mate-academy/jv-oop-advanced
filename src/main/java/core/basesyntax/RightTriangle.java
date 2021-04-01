package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideOne;
    private int sideTwo;

    public RightTriangle(int sideOne, int sideTwo, String color) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double findArea() {
        return sideOne * sideTwo / 2;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Isosceles trapezoid, area = " + findArea()
                + " sq. units, side one = " + sideOne
                + " units, side two = " + sideTwo
                + " units, color = " + getColor());
    }
}
