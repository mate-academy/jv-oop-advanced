package core.basesyntax;

public class RightTriangle extends Figure {
    private double triangleSide1;
    private double triangleSide2;

    public RightTriangle(String color, double triangleSide1, double triangleSide2) {
        super(color);
        this.triangleSide1 = triangleSide1;
        this.triangleSide2 = triangleSide2;
    }

    @Override
    public double getArea() {
        return (triangleSide1 * triangleSide2) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle" + " area: " + getArea() + " triangle Side1: "
                + triangleSide1 + " triangle Side2: " + triangleSide2 + " color: " + color);
    }
}
