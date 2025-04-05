package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + this.type.name().toLowerCase()
                + ", area: "
                + (side * side)
                + " units, side: "
                + side
                + " units, color: "
                + this.color.name().toLowerCase());
    }
}
