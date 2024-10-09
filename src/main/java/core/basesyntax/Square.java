package core.basesyntax;

public class Square extends Figure implements Area, Draw {
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
        return side * side;
    }

    @Override
    public void toDraw() {
        System.out.println("The Figure: Square; side = " + side
                + "\n" + " Area: " + getArea() + "; Color: " + getColor() + "\n");
    }
}
