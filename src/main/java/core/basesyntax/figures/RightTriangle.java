package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Right Triangle is drawn.");
    }

    @Override
    public double getArea() {
        return 0.25 * Math.sqrt(3) * side * side;
    }
}
