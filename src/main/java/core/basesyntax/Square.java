package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, String name, int side) {
        super(color, name);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void getFigureInfo() {
        System.out.println("Figure: " + getName() + ", area: " + area()
                + " sq. units, Side: " + getSide() + ", Color: " + getColor());
    }
}
