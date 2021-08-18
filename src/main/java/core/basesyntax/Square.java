package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        super.setColor(color);
    }

    @Override
    public double area() {
        return side * side;
    }

    public void info() {
        System.out.printf("Figure: %s, area: %s sq.units, side: %s units, color: %s%n",
                    getType(), area(), side, getColor());
    }
}
