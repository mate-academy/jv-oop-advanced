package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor()
                + " square, with " + getSide() + " units side");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void getFigureData() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + getSide()
                + " units, color: " + getColor());
    }
}
