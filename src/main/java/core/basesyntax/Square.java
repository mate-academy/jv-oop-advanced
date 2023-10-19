package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getClass().getSimpleName()
                + " Area: " + getSquare()
                + " side " + getSide()
                + " Color: " + getColor());
    }
}
