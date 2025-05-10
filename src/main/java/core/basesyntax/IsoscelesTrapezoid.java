package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String FIGURE = "isosceles trapezoid";
    private int parallelSideA;
    private int parallelSideB;
    private int height;

    protected IsoscelesTrapezoid(String color, int parallelSideA, int parallelSideB, int height) {
        super(color);
        this.parallelSideA = parallelSideA;
        this.parallelSideB = parallelSideB;
        this.height = height;
    }

    @Override
    public double findArea() {
        return (parallelSideA + parallelSideB) / 2 * height;
    }

    @Override
    public String toDraw() {
        return "Figure: " + FIGURE + ", area: " + findArea()
                + ", parallel side a: " + this.parallelSideA
                + ", parallel side b: " + this.parallelSideB
                + ", height: " + this.height
                + ", color: "
                + this.color;
    }
}
