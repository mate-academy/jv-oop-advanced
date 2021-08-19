package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        setType("Square");
        setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println(new StringBuilder().append("Figure: ")
                .append(getType())
                .append(", Area: ")
                .append(getArea())
                .append(" sq.units")
                .append(", Side: ")
                .append(side)
                .append(" units")
                .append(", color: ")
                .append(getColor()));
    }
}
