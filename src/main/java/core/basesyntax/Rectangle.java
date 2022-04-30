package core.basesyntax;

public class Rectangle extends Figure implements Area, Draw{
    private static final String name = "rectangle";
    private final int height;
    private final int length;

    public Rectangle(Colors color, int height, int length) {
        super(color);
        this.height = height;
        this.length = length;
    }

    @Override
    public double areaCalculator() {
        return height * length;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f height: %d units, " +
                        "length: %d units, color: %s",
                name, areaCalculator(), height, length, getColor().toString());

    }
}
