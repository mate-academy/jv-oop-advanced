package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
    }

    public String draw() {
        return "Figure : Square, Area :" + getArea() + " Side: " + side + " Color: " + color.name();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}