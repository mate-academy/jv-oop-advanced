package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getName()
                + ", area: " + calculateArea()
                + " sq. units, side: " + getSide()
                + " units, color: " + getColor());
    }
}
