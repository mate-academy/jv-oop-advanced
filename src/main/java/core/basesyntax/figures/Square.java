package core.basesyntax.figures;

public class Square extends Figure {
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
    public void draw() {
        System.out.println("figure: square, aria: " + getArea() + ", side: "
                + getSide() + ", color: " + getColor());
    }
}
