package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawInfo() {
        System.out.println(String.format(
                "Figure: %s, area: %s sq.units, radius: %s units, color: %s",
                getClass().getSimpleName(), getArea(), side, getColor()));
    }
}
