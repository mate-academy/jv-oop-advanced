package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: rectangle, area: ")
                .append(getArea())
                .append(" sq.units, first side: ")
                .append(firstSide)
                .append(" sq.units, second side: ")
                .append(secondSide)
                .append(" units, color: ")
                .append(getColor());
        System.out.append(builder.toString());
    }
}
