package core.basesyntax;

public class Square extends Figure {
    int side;

    public Square(String color, int side) {
        super("square", color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void Draw() {
        System.out.println("Figure: " + getName() + " square: " + getSquare() + " side: " + getSide() +
                " color: " + getColor());
    }

    @Override
    double getSquare() {
        return getSide() * getSide();
    }
}
