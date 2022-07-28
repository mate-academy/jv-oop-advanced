package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        setColor(color);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Figure: Rectangle, ").append("area: ")
                .append(Double.valueOf(getArea()).toString()).append(" sq.units, first side: ")
                .append(Integer.valueOf(firstSide).toString()).append(" units, second side: ")
                .append(Integer.valueOf(secondSide).toString())
                .append(" units, color: ").append(getColor()).toString();
    }
}
