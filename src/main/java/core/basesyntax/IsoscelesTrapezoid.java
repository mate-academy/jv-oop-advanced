package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base;
    private int top;
    private int height;

    public IsoscelesTrapezoid(int base, int top, int height, String color) {
        this.base = base;
        this.top = top;
        this.height = height;
        setType("IsoscelesTrapezoid");
        setColor(color);
    }

    @Override
    public double getArea() {
        return (base + top) / 2 * height;
    }

    @Override
    public void drawFigure() {
        System.out.println(new StringBuilder().append("Figure: ")
                .append(getType())
                .append(", Area: ")
                .append(getArea())
                .append(" sq.units")
                .append(", base: ")
                .append(base)
                .append(" units")
                .append(", top: ")
                .append(top)
                .append(" units")
                .append(", height: ")
                .append(height)
                .append(" units")
                .append(", color: ")
                .append(getColor()));
    }
}
