package core.basesyntax;

public class Square extends Figure implements Area, Draw {
    private static final String name = "square";
    private final int side;

    public Square(Colors color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double areaCalculator() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f side: %d units, color: %s",
                name, areaCalculator(), side, getColor().toString());

    }
}
