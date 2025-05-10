package core.basesyntax;

public class Rectangle extends Figure {
    private final double side;
    private final double side2;

    public Rectangle(String color, int side, int side2) {
        this.side2 = side2;
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side2 / 2;
    }

    @Override
    public String descriptionOfSide() {
        StringBuilder sb = new StringBuilder("Figure: Rectangle, area: ");
        sb.append(getArea())
                .append(" sq.units, height: ")
                .append(side)
                .append(" units, width: ")
                .append(side2)
                .append(" units, color: ")
                .append(color);
        return sb.toString();
    }
}
