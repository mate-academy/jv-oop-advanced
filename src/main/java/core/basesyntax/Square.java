package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + calculate()
                + " sq. units, side: " + side + " color: " + color.name().toLowerCase());
    }

    @Override
    public double calculate() {
        return side * side;
    }
}
