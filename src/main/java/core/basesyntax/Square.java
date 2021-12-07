package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        this.side = side;
        super.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Square, color: " + color.toString()
                + ", radius: " + side
                + ", area: " + getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
