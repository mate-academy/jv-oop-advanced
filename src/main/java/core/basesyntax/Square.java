package core.basesyntax;

public class Square extends Figure {
    private int side;
    private final Color color;

    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea() + "sq. units," + "side: " + side
                + "units" + "color: " + color.name());
    }
}
