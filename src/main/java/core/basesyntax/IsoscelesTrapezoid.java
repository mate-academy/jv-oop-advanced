package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double lowerSide;
    private double height;
    private double diagonal1;
    private double diagonal2;

    public IsoscelesTrapezoid(Color color, double upperSide, double lowerSide,
                              double height, double diagonal1, double diagonal2) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculateArea() {
        return (upperSide + lowerSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Hello, my name is IsoscelesTrapezoid, my area: " + calculateArea()
                + " my side: " + upperSide + " " + lowerSide + ", my height: "
                + height + ", my diagonals: " + diagonal1 + " my color: " + getColor());
    }
}
