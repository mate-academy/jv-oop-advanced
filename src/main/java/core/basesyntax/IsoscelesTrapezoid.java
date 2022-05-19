package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstSide;
    private final double secondSide;
    private final double height;

    public IsoscelesTrapezoid(Color color, double firstSide, double secondSide, double height) {
        super(color, FigureType.TRAPEZOID);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (height / 2) * (firstSide * secondSide);
    }

    @Override
    public void draw() {

        System.out.printf("Figure: %s, area: %f, color = %s, firstSide = %f, secondSide = %f, "
                        + "height = %f\n",
                getFigureType().getValue(), calculateArea(),
                getColor(), firstSide, secondSide, height);
    }
}
