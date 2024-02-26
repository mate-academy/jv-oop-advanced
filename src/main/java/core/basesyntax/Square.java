package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void describe() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq, side: "
                + getSide() + " units, color: " + getColor());
    }
}
