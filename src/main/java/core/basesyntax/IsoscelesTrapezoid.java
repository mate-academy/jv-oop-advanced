package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double CONSTANT = 0.5;
    private double baseUpper;
    private double baseLower;
    private double height;

    public IsoscelesTrapezoid(Colors color, Figures typeOfFigure, double baseLower,
                              double baseUpper, double height) {
        super(color, typeOfFigure);
        this.baseLower = baseLower;
        this.baseUpper = baseUpper;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return (baseLower + baseUpper) * CONSTANT * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getTypeOfFigure() + ", area: " + getSquare()
                + " sq.units, Lower base: " + baseLower + " units, Upper base: " + baseUpper
                + " units, Height: " + height + " units, color: " + getColor());
    }
}
