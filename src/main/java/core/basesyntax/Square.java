package core.basesyntax;

public class Square extends Figure {
    private static final String name = "square";
    private int side;

    public Square(int side) {
        setSide(side);
    }

    public Square(int side, Colors color) {
        setSide(side);
        setColor(color);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + ", side: " + getSide() + ", color: " + getColor());
    }
}
