package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideOne;
    private int sideTwo;

    public RightTriangle(String color, int sideOne, int sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea() + " sq. units, "
                + "sideOne: " + sideOne + "units, " + "sideTwo: " + sideTwo + "units, "
                + "color:" + getColor());
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo / 2;
    }
}
