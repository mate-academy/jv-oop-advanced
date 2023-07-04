package core.basesyntax.figure;

public class Square extends Figure {
    private final int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        String color = getColor().name().toLowerCase();
        String info = "Figure: square, area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + color;
        System.out.println(info);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
