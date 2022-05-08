package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: rectangle, area: ");
        stringBuilder.append(getArea());
        stringBuilder.append(" units, side1: ");
        stringBuilder.append(side1);
        stringBuilder.append(" units, side2: ");
        stringBuilder.append(side2);
        stringBuilder.append(" units, color: ");
        stringBuilder.append(getColor());
        return stringBuilder.toString();
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }
}
