package core.basesyntax;

public class Rectangle extends Square {
    private static final double DEFAULT_DECIMAL_RANK = 10.0;
    private final int secondSide;

    public Rectangle(String color, int side, int secondSide) {
        super(color, side);
        this.secondSide = secondSide;
    }

    public double getArea() {
        return Math.round(getSide() * secondSide * DEFAULT_DECIMAL_RANK) / DEFAULT_DECIMAL_RANK;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq. units,"
                + " side: " + getSide() + " units,"
                + " secondSide: " + secondSide + " units,"
                + " color: " + getColor()
        );
    }
}
