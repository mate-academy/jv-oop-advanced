package core.basesyntax;

public class Square extends Figure {

    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
        setArea(side * side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units,"
                + " side: " + side + " units, color: " + getColor());
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}