package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideOne;
    private int sideTwo;
    private int hypotenuse;

    public RightTriangle(int sideOne, int sideTwo, int hypotenuse, String color) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double findArea() {
        return (sideOne * sideTwo) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Isosceles trapezoid, area = " + findArea()
                + " sq. units, side one = " + sideOne
                + " units, side two = " + sideTwo
                + " units, hypotenuse = " + hypotenuse
                + " units, color = " + getColor());
    }
}
