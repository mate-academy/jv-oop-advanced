package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int countArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: Square\n\tcolor - " + getColor() + ";"
                + "\n\t area - " + countArea() + " sq. units;"
                + "\n\t side - " + side + " units.";
    }
}
