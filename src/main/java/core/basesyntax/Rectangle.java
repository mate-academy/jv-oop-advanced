package core.basesyntax;

public class Rectangle extends Figure {
    private final FigureType figureName;
    private final double length;
    private final double height;

    public Rectangle(Color color, double length, double height) {
        super(color);
        this.length = length;
        this.height = height;
        this.figureName = FigureType.RECTANGLE;
    }

    @Override
    public double calculateFigureArea() {
        return length * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + figureName
                + " area: " + calculateFigureArea() + " sq.unit, side: "
                + "length " + length + " units, "
                + "height " + height + " units, "
                + "color: " + getColor());
    }
}
