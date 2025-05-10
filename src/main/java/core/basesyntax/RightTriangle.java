package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstCathetus;
    private final double secondCathetus;

    public RightTriangle(Color color, double firstCathetus, double secondCathetus) {
        super(color);
        this.firstCathetus = firstCathetus;
        this.secondCathetus = secondCathetus;

    }

    @Override
    public double getArea() {
        return (firstCathetus + secondCathetus) / 2;
    }

    @Override
    public String draw() {
        return this.getClass().getSimpleName() + "{ firstCathetus: "
                + firstCathetus + " units, secondCathetus: "
                + secondCathetus + " units, area: " + getArea() + " square units, color: "
                + getColor() + " }";
    }
}
