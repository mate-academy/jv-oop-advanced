package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double lowerSide;
    private double height;

    public IsoscelesTrapezoid(Color color, double upperSide, double lowerSide,
                              double height) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (upperSide + lowerSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Hello, my name is IsoscelesTrapezoid, my area: " + calculateArea()
                + " my side: " + upperSide + " " + lowerSide + ", my height: "
                + height + " my color: " + getColor());
    }
}
