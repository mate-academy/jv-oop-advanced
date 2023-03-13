package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double height;
    private final double firstSide;
    private final double secondSide;

    public IsoscelesTrapezoid(String color, double height, double firstSide, double secondSide) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        double constanta = 2.0;
        return (firstSide + secondSide) / constanta * height;
    }

    @Override
    public void print() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: isosceles trapezoid, area: ")
                .append(getArea())
                .append(" sq.units, height: ")
                .append(height)
                .append(", first side: ")
                .append(firstSide)
                .append(" units, last side: ")
                .append(secondSide)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
