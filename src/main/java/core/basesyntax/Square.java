package core.basesyntax;

public class Square extends Figure implements Drawable, Calculateble {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getSquare() {
        return side * side;
    }
}
