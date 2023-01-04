package core.basesyntax.Figures;

public class Square extends Figure implements Drawable{
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (double) side * 2;
    }

    @Override
    public void draw() {

    }
}
