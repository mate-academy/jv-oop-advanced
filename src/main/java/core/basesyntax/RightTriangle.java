package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstCathetus;
    private final double secondCathetus;

    public RightTriangle(Color color, double firstCathetus, double secondCathetus) {
        super(color);
        if (!FigureDimensionsValidator.isValidDimensions(firstCathetus, secondCathetus)) {
            throw new FigureDimensionError(this.getClass().getSimpleName());
        }
        this.firstCathetus = firstCathetus;
        this.secondCathetus = secondCathetus;

    }

    @Override
    public double getArea() {
        return (firstCathetus + secondCathetus) / 2;
    }

    @Override
    public String draw() {
        return super.draw() + " { firstCathetus: " + firstCathetus + " units, secondCathetus: "
                + secondCathetus + " units, area: " + getArea() + " square units, color: "
                + getColor() + " }";
    }
}
