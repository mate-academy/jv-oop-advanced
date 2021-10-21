package core.basesyntax;

public class Square extends Shape implements AreaCounter {
    private int side;

    Square(int side, String color) {
        super("Square", color);
        this.side = side;
        float valueOfArea = countArea();
        setArea(valueOfArea);
    }

    @Override
    public float countArea() {
        return (float) (side * side);
    }

    @Override
    public String toString() {
        return "Square, " + "area: " + getArea() + " sq.units" + " side: " + side
                + " units" + ", color: " + getColor();
    }
}
