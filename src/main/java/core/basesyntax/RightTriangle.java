package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String FIGURE_NAME = "right triangle";
    private double firstSide;
    private double secondSide;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public RightTriangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        setFigureName(FIGURE_NAME);
        setArea(calculateArea());
        setColor(colorSupplier.getRandomColor());
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureName() + ", color: " + getColor() + ", area: "
                + getArea() + " sq. units, first side: " + firstSide + " units, second side: "
                + secondSide + " units");
    }
}
