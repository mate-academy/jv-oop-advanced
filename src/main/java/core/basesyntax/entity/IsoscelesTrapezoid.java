package core.basesyntax.entity;

public class IsoscelesTrapezoid extends Figure {
    private double base;
    private double top;
    private double leg;

    public IsoscelesTrapezoid(double base, double top, double leg, Color color) {
        this.base = base;
        this.top = top;
        this.leg = leg;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder()
                .append("Figure: isosceles trapezoid, area:")
                .append(String.format("%.1f", getArea()).replace(',', '.'))
                .append(", top: ")
                .append(String.format("%.1f", top).replace(',', '.'))
                .append(" units, base: ")
                .append(String.format("%.1f", base).replace(',', '.'))
                .append(" units, ").append("leg: ")
                .append(String.format("%.1f", leg).replace(',', '.'))
                .append(" units, ").append("color: ")
                .append(this.color).toString());
    }

    @Override
    public double getArea() {
        double baseLeg = (base - top) / 2;
        double height = Math.sqrt(leg * leg - baseLeg * baseLeg);
        double middleLine = (base + top) / 2;
        return middleLine * height;
    }
}
