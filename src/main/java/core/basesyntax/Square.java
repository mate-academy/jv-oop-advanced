package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(int side, Color color) {
        this.side = side;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Square{"
                + "area=" + getArea()
                + ", side=" + side
                + ", color=" + getColor().name() + '}';
    }
}
