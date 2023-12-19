package core.basesyntax;

public class RightTriangle extends Figure {
    private double catOne;
    private double catTwo;

    public RightTriangle(double catOne, double catTwo, String color) {
        super(color);
        this.catOne = catOne;
        this.catTwo = catTwo;
    }

    @Override
    public double getArea() {
        return (catOne * catTwo) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " , cat1: " + catOne + " , cat2: " + catTwo + " , color: " + color);
    }
}
