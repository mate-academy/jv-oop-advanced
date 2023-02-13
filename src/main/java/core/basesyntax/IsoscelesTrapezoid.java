package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseUp;
    private double baseDown;
    private double height;

    public IsoscelesTrapezoid(double baseUp, double baseDown, double height, String color) {
        this.baseUp = baseUp;
        this.baseDown = baseDown;
        this.height = height;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return ((baseUp + baseDown) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "trapezoid, area: "
                + calculateArea() + " sq.units, baseUp: "
                + baseUp + " sq.units, baseDown: "
                + baseDown + " sq.units, height: "
                + height + " color: " + color);
    }
}
