package core.basesyntax;

public class Rectangle extends Figure {
    private int firstside;
    private int secondside;

    public Rectangle(int firstside, int secondside, Color color) {
        this.color = color;
        this.firstside = firstside;
        this.secondside = secondside;
    }

    @Override
    public double getArea() {
        return firstside * secondside;
    }

    @Override
    public String getDraw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: rectangle, area ")
                .append(getArea()).append(" sq. units, firstside: ")
                .append(firstside)
                .append(" units, secondside: ")
                .append(secondside)
                .append(" units, color: ")
                .append(color);
        return builder.toString();
    }
}
