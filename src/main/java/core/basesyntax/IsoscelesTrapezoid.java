package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double smallerBase;
    private double largeBase;
    private double side;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(String color, double smallerBase, double largeBase, double side) {
        super(color);
        this.smallerBase = smallerBase;
        this.largeBase = largeBase;
        this.side = side;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: isosceles trapezoid, area: ").append(getArea())
                .append(" sq.units, smaller base: ").append(smallerBase)
                .append(" units, large base: ").append(largeBase)
                .append(" units, side: ").append(side)
                .append(" units, color: ").append(color.toLowerCase());
        return builder.toString();
    }

    @Override
    public double getArea() {
        return ((largeBase + smallerBase) / 2)
                * Math.sqrt(side * side - (Math.pow((largeBase - smallerBase), 2) / 4));
    }
}
