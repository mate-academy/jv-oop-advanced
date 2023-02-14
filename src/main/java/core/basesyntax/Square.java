package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square() {

    }

    public Square(String color, int side) {
        this.side = side;
        this.color = color;
    }

    public Square(String color) {
        this.color = color;
    }

    @Override
    public float getArea() {
        return (float)(side * side);
    }

    @Override
    public String draw() {
        return super.toString() + ", area: " + getArea()
                + " sq.units, side: " + side + " units";
    }
}
