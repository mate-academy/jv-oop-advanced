package core.basesyntax.model;

public class Square extends Figure{
    private int side;

    public Square(String name, int area, String color, int side) {
        super(name, area, color);
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString() + ", side: " + side;
    }
}
