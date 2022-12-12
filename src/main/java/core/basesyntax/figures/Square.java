package core.basesyntax.figures;

public class Square extends Figure {
    private final int side;

    public Square(int side,String color) {
        super(color);
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * 4;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + this.getArea() + " side: "
                + this.side + " units, color: " + this.getColor());
    }
}
