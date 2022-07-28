package core.basesyntax;

public class Square extends Figure implements Drawable{
    private int side;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
