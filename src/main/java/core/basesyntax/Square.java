package core.basesyntax;

public class Square extends Figure implements Drowable {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void drow() {
        System.out.println("Name: " + getClass().getSimpleName()
                + " Color: " + this.getColor()
                + " Side: " + side + " units."
                + " Area: " + getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
