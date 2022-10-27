package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(String color, int side) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side * Math.sqrt(3) / 4;
    }

    @Override
    public String descriptionOfSide() {
        StringBuilder sb = new StringBuilder("Figure: Right Triangle, area: ");
        sb.append(getArea())
                .append(" sq.units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(color);
        return sb.toString();
    }
}
