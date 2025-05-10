package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String OUTPUT_ISOSCELESTRAPEZOID = "Figure: isoscelesTrapezoid, "
            + "area: %.2f sq. units, highDiagonal: %.2f units, "
            + "lowDiagonal: %.2f units, "
            + "height: %.2f units, "
            + "color: %s";
    private double highDiagonal;
    private double lowDiagonal;
    private double height;

    public IsoscelesTrapezoid(Color color, double highDiagonal, double lowDiagonal, double height) {
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
                this.area,
                this.highDiagonal,
                this.lowDiagonal,
                this.height,
                this.color
        ));
    }
}
