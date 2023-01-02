package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double top;
    private double bottom;

    IsoscelesTrapezoid(String color, double height, double top, double bottom) {
        super(color);
        this.height = height;
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public double getArea() {
        return height * top - (top - bottom) * height;
    }

    @Override
    public void print() {
        System.out.println(
                new StringBuilder("Figure: isosceles trapezoid, area: ")
                .append(String.format("%.1f", getArea()))
                .append(" sq.units, height: ")
                .append(height)
                .append(" units, top: ")
                .append(top)
                .append(" units, bottom: ")
                .append(bottom)
                .append(" units, color: ")
                .append(super.getColor().toLowerCase())
                .toString()
        );
    }

}
