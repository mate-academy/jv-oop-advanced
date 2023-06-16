package core.basesyntax;

public class Square extends Figure implements Drawable, Obtainable{
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println();
    }

    @Override
    public double getArea() {
        return 0;
    }
}
