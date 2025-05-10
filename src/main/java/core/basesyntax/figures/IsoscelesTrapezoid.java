package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final double baseUp;
    private final double baseBottom;
    private final double height;

    public IsoscelesTrapezoid(String color, double baseUp, double baseBottom, double height) {
        super(color);
        this.baseUp = baseUp;
        this.baseBottom = baseBottom;
        this.height = height;
    }

    public double calcArea() {
        return 0.5 * (baseUp + baseBottom) * height;
    }

    @Override
    public void draw() {
        String output = "Figure: isosceles trapezoid" + System.lineSeparator()
                + "Color: " + color + System.lineSeparator()
                + "Area: " + roundDouble(calcArea()) + " sq. units" + System.lineSeparator()
                + "Base (top): " + roundDouble(baseUp) + " units" + System.lineSeparator()
                + "Base (bottom): " + roundDouble(baseBottom) + " units" + System.lineSeparator()
                + "Height: " + roundDouble(height) + " units";

        System.out.println(output);
    }

}
