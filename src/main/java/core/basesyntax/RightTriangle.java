package core.basesyntax;

public class RightTriangle extends Figure {
    private final int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Right Triangle is drawn. Side = " + side + " Color is " + color);
    }

    @Override
    public double getArea() {
        return 0.25 * Math.sqrt(3) * side * side;
    }
}
