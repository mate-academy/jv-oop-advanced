package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder("Figure: square, area: ")
                .append(dF.format(getArea())).append(" sq.units, side: ")
                .append(side).append(" units").append(", color: ")
                .append(getColor()));
    }
}
