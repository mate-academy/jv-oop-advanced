package core.basesyntax.figure;

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
        return side ^ 2;
    }

    @Override
    public void draw() {
        System.out.println("----------------------------"
                + "\n" + "Figure: square"
                + "\n" + "Area: " + getArea() + " sq.units"
                + "\n" + "Side: " + side + " units"
                + "\n" + "Color: " + getColor()
                + "\n" + "----------------------------" + "\n");

    }
}
