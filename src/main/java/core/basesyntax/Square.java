package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void draw() {
        info.append("Figure: Square, area: ")
                .append(getArea())
                .append(" sq.units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(color);
        System.out.println(info.toString());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
