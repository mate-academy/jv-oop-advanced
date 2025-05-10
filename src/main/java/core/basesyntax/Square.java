package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Name: " + getClass().getSimpleName()
                + ", Color: " + getColor()
                + ", Side: " + side + " units."
                + ", Area: " + getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
