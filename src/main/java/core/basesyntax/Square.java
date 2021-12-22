package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawable {
    private int side;
    private String colour;

    public Square(int side, String colour) {
        this.side = side;
        this.setColour(colour);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, " + "area: " + getArea() + " sq.units, "
                + "side: " + side + " units, " + "color: " + getColour());
    }
}
