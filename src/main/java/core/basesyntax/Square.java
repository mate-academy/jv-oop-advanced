package core.basesyntax;

public class Square extends Shape {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
        countArea();
    }

    @Override
    public float countArea() {
        return (float) (side * side);
    }

    @Override
    public void draw() {
        System.out.println( "Square, " + "area: " + getArea() + " sq.units" + " side: " + side
                + " units" + ", color: " + getColor());
    }
}
