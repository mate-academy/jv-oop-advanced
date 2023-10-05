package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideOne;
    private double sideTwo;
    private double height;

    public IsoscelesTrapezoid(double sideOne, double sideTwo, double height, String color) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;
    }

    @Override
    public void calculateSquare() {
        System.out.println("Square Of IsoscelesTrapezoid = " + (sideOne + sideTwo) / 2 * height);

    }

    @Override
    String getInfo() {
        return "Figure: IsoscelesTrapezoid, area: " + (sideOne + sideTwo) / 2 * height
                + " sq.units, " + "sideOne " + sideOne + " units, " + "sideTwo "
                + sideTwo + " units, " + "height " + height + ", color: " + getColor();
    }
}
