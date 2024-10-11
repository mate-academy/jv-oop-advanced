package core.basesyntax;

public class Square extends Figures {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return 4 * side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: " + area()
                        + " sq. units, side: " + side
                        + " units, color: " + getColor());
    }
}
