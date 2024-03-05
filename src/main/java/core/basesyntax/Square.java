package core.basesyntax;

public class Square extends Figure implements Drawable {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public int getArea() {
        return 0;
    }
    @Override
    public String draw() {
        return null;
    }
}
