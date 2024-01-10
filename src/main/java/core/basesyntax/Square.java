package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        super.color = color;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return "Figure: Square, area: "
                + getArea()
                + ", side: "
                + side
                + ", color: "
                + color;
    }
}
