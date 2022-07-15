package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void draw() {
        info.append("Figure: Right triangle, area: ")
                .append(getArea())
                .append(" sq.units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(color);
        System.out.println(info.toString());
    }

    @Override
    public double getArea() {
        return (side * side) * (Math.sqrt(3) / 4);
    }
}
