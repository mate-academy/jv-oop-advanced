package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int upperBase;
    private int lowerBase;

    public IsoscelesTrapezoid(int height, int upperBase, int lowerBase) {
        this.height = height;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: right Isosceles Trapezoid, area: ")
                .append(getArea())
                .append(" sq.units, height: ")
                .append(height)
                .append(" sq.units, upper base: ")
                .append(upperBase)
                .append(" sq.units, lower base: ")
                .append(lowerBase)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
