package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawable {
    private int side;

    public Square (Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, "
        + "area: " + Math.floor(getArea()) + " sq.units, "
        + "side: " + side + " units, "
        + "color: " + color.toString().toLowerCase());
    }
}
