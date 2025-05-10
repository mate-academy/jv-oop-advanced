package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = side * side;
        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + color;
    }
}
