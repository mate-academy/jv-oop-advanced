package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideOne;
    private int sideTwo;

    public RightTriangle(int sideOne, int sideTwo) {
        super(new ColorSupplier().get());
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getArea() {
        return Math.floor((sideOne * sideTwo) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, " + "area: " + getArea() + ", sideOne: "
                + sideOne + ", sideOne: " + sideTwo + ", color: " + getColor());
    }

    @Override
    public String toString() {
        return "RightTriangle{"
                + "sideOne=" + sideOne
                + ", sideTwo=" + sideTwo
                + '}';
    }
}
