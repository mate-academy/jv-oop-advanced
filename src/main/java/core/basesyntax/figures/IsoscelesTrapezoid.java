package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {

    private static final String OUTPUT_ISOSCELESTRAPEZOID = "Figure: isoscelesTrapezoid, "
            + "area: %.2f sq. units, highDiagonal: %.2f units, "
            + "lowDiagonal: %.2f units, "
            + "height: %.2f units, "
            + "color: %s";
    private double highDiagonal;
    private double lowDiagonal;
    private double height;

    public IsoscelesTrapezoid(String color, double highDiagonal,
                              double lowDiagonal, double height) {
        super(color);
        this.highDiagonal = highDiagonal;
        this.lowDiagonal = lowDiagonal;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        this.area = ((highDiagonal + lowDiagonal) / 2) * height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                OUTPUT_ISOSCELESTRAPEZOID,
                calculateArea(),
                this.highDiagonal,
                this.lowDiagonal,
                this.height,
                getColor()
        ));
    }
}
