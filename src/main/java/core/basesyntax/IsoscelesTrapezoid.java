package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseUp;
    private double baseDown;
    private double height;

    public IsoscelesTrapezoid(double baseUp, double baseDown, double height, String color) {
        this.baseUp = baseUp;
        this.baseDown = baseDown;
        this.height = height;
        setColor(color);
    }

    @Override
    public double getArea() {
        return ((baseUp + baseDown) / 2) * height;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: ");
        stringBuilder.append("trapezoid, area: ")
                .append(getArea())
                .append(" sq.units, baseUp: ")
                .append(baseUp)
                .append(" sq.units, baseDown: ")
                .append(baseDown)
                .append(" sq.units, height: ")
                .append(height)
                .append(" color: ").append(getColor());
        System.out.println(stringBuilder);
    }
}
