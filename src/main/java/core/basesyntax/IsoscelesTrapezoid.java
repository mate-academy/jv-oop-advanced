package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double area() {
        return (firstSide + secondSide / 2 * height);
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: isosceles trapezoid, area: ")
                .append(area())
                .append(" sq.units, first side: ")
                .append(firstSide)
                .append(" units, second side: ")
                .append(secondSide)
                .append(" units, height: ")
                .append(height)
                .append(" units, color: ")
                .append(getColor());
        return builder.toString();
    }
}
