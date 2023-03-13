package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println(START_MASSAGE + this + ", area: " + this.getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "square, "
                + "its color: " + color
                + ", with side: " + side + " units";
    }
}
