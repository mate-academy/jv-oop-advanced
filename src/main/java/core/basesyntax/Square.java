package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("THIS IS SQUARE");
    }

    @Override
    public String displayInformation() {
        return "Figure: Square, area: " + getArea() + " sq. units, side length: " + side
                + " units, color: " + getColor();
    }
}
