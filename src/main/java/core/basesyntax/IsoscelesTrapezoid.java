package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double baseUp;
    private final double baseDown;
    private final double height;

    IsoscelesTrapezoid(double baseUp, double baseDown, double height, String color) {
        super(color);
        this.baseUp = baseUp;
        this.baseDown = baseDown;
        this.height = height;
    }

    @Override
    public double countArea() {
        return ((baseDown + baseUp) * height) / 2;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + countArea()
                + " sq.units, baseUp:" + baseUp + " units, baseDown: " + baseDown
                + " units, height: " + height + " units, color: " + color);
    }
}
