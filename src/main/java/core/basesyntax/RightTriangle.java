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
    public double getArea() {
        return sideOne * sideTwo / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea() + " sq.units, first side: "
                + sideOne + " sq.units, second side: "
                + sideTwo + " units, color: "
                + getColor());
    }
}
