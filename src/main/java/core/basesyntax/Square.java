package core.basesyntax;

public class Square extends Figure{
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {

    }

    @Override
    public double area() {
        return (double) side*side;
    }
}
