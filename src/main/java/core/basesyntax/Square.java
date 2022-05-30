package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        name = getClass().getSimpleName();
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %f sq.units, side: %f units, color: %s \n",
                name, getArea(), side, color);
    }
}
