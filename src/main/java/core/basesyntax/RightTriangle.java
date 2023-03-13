package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public RightTriangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        double constant = 2;
        return firstSide * secondSide / constant;
    }

    @Override
    public void print() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: rectangle, area: ")
                .append(getArea())
                .append(" sq.units, first side ")
                .append(firstSide)
                .append(" units, last side: ")
                .append(secondSide)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
