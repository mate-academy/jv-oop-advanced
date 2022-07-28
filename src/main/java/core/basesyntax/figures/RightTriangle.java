package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final int side;

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

    @Override
    public String toString() {
        return "triangle, "
                + "its color: " + color
                + ", with side: " + side + " units";
    }
}
