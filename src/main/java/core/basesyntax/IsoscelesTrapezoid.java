package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double upperSide, double lowerSide, double height) {
        super(color);
        this.upperBase = upperSide;
        this.lowerBase = lowerSide;
        this.height = height;
    }
    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }
    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: isosceles trapezoid, area: ")
                .append(getArea())
                .append(" sq. units, upper base: ")
                .append(upperBase)
                .append(" units, lower base: ")
                .append(lowerBase)
                .append(" units, height: ")
                .append(height)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder);
    }
}
