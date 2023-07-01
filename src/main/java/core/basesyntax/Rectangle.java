package core.basesyntax;

public class Rectangle extends Figure {
    private final FigureEnum figureName;
    private final double length;
    private final double height;

    public Rectangle(String color, double length, double height) {
        super(color);
        this.length = length;
        this.height = height;
        this.figureName = FigureEnum.RECTANGLE;
    }

    @Override
    public double getFigureArea() {
        return length * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + figureName
                + " area: " + getFigureArea() + " sq.unit, side: "
                + "length " + length + " units, "
                + "height " + height + " units, "
                + "color: " + getColor());
    }
}
