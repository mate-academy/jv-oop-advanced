package core.basesyntax;

public class Square extends Figure {
    private static final double DEFAULT_DECIMAL_RANK = 10.0;
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.round(side * side * DEFAULT_DECIMAL_RANK / DEFAULT_DECIMAL_RANK);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq. units,"
                + " side: " + side + " units,"
                + " color: " + getColor()
        );
    }
}
