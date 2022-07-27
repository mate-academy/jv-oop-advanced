package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int a, String color) {
        this.side = a;
        setColor(color);
    }

    public void setSide(int a) {
        this.side = a;
    }

    public int getSide() {
        return this.side;
    }

    @Override
    public int countArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: Square\n\tcolor - " + getColor() + ";"
                + "\n\t area - " + this.countArea() + " sq. units;"
                + "\n\t side - " + this.side + " units.";
    }
}
