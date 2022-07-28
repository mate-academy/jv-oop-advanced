package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double AREA_MULTIPLIER = 0.5;
    private double firstCathetus;
    private double secondCathetus;

    public RightTriangle(Color color, double firstCathetus, double secondCathetus) {
        super(color);
        this.firstCathetus = firstCathetus;
        this.secondCathetus = secondCathetus;
    }

    @Override
    public double calculateArea() {
        return firstCathetus * secondCathetus * AREA_MULTIPLIER;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: "
                + calculateArea() + " sq.units, firstSide: "
                + firstCathetus + " units, secondSide: "
                + secondCathetus + " units, color: "
                + getColor();
    }
}
