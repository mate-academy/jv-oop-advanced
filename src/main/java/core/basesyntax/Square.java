package core.basesyntax;

public class Square extends AbstrFigure {
    private final String figure = "square";
    private int side;
    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, "
                + "upper side: " + side + " units, color: " + getColor());
    }
}
