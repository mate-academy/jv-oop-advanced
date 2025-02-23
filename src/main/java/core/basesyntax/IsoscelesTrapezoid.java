package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public void toDraw() {
        StringBuilder str = new StringBuilder();
        System.out.println(str
                .append("Figure: trapezoid, area: ")
                .append(getArea())
                .append("sq. units, side 1: ")
                .append(base1)
                .append("units, side 2:")
                .append(base2)
                .append("units, height: ")
                .append(height)
                .append("color: ")
                .append(color));
    }

    @Override
    public double getArea() {
        return (base1 * base2) / 2 * height;
    }
}
