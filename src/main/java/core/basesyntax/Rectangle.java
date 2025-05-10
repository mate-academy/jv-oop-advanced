package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double area() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: right triangle, area: ")
                .append(area())
                .append(" sq.units, first side: ")
                .append(firstSide)
                .append(" units, second side: ")
                .append(secondSide)
                .append(" units, color: ")
                .append(getColor());
        return builder.toString();
    }
}
